package com.baidu.test.SJMS;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lmy on 2016/9/11.
 * 状态模式：改变状态里的代码，会体现在实际业务的执行中
 */
interface VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager);
}

class NormalVoteState implements VoteState {

    public void vote(String user, String voteItem, VoteManager voteManager) {
        voteManager.getMapVote().put(user, voteItem);
        System.out.println("恭喜投票成功");
    }
}

class RepeatVoteState implements VoteState {
    public void vote(String uesr, String voteItem, VoteManager voteManager) {
        System.out.println("请不要重复投票");
    }
}

class SpiteVoteState implements VoteState {

    public void vote(String user, String voteItem, VoteManager voteManager) {
        String str = voteManager.getMapVote().get(user);

        if (str != null) {
            voteManager.getMapVote().remove(user);
        }
        System.out.println("你有恶意刷票行为，取消投票资格");
    }
}

class BlackVoteState implements VoteState{

    public void vote(String user, String voteItem, VoteManager voteManager) {
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }
}

class VoteManager{
    private VoteState state = null;

    private Map<String, String> mapVote = new HashMap<String, String>();

    private Map<String, Integer> mapVoteCount = new HashMap<String, Integer>();

    public Map<String, String> getMapVote() {
        return mapVote;
    }

    public void vote(String user, String voteItem) {
        Integer oldVoteCount = mapVoteCount.get(user);
        if (oldVoteCount == null) {
            oldVoteCount = 0;
        }
        oldVoteCount += 1;
        mapVoteCount.put(user, oldVoteCount);

        if (oldVoteCount == 1) {
            state = new NormalVoteState();
        } else if (oldVoteCount >= 5 && oldVoteCount < 8) {
            state = new SpiteVoteState();
        } else if (oldVoteCount > 8) {
            state = new BlackVoteState();
        }

        state.vote(user, voteItem, this);



    }
}

public class ZhuangTai {
    public static void main(String[] args) {
        VoteManager vm = new VoteManager();
        for(int i=0;i<9;i++) {
            vm.vote("u1", "A");
        }
    }
}
