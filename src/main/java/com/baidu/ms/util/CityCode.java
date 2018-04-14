package com.baidu.ms.util;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class CityCode {
    public static HashMap<String, String[]> cityCode = null;

    public static HashMap<String, String[]> getCityInfo() {
        if (cityCode == null) {

            cityCode = new HashMap<String, String[]>();
            cityCode.put("北京市", new String[]{"010", "11"});
            cityCode.put("上海市", new String[]{"021", "31"});
            cityCode.put("天津市", new String[]{"022", "12"});
            cityCode.put("重庆市", new String[]{"023", "50"});
            cityCode.put("香港", new String[]{"852"});
            cityCode.put("澳门", new String[]{"853"});

            // 河北省
            cityCode.put("河北省", new String[]{"0311", "13"});
            cityCode.put("石家庄", new String[]{"0311", "13"});
            cityCode.put("邯郸市", new String[]{"0310"});
            cityCode.put("保定市", new String[]{"0312"});
            cityCode.put("张家口", new String[]{"0313"});
            cityCode.put("承德市", new String[]{"0314"});
            cityCode.put("唐山市", new String[]{"0315"});
            cityCode.put("廊坊市", new String[]{"0316"});
            cityCode.put("沧州市", new String[]{"0317"});
            cityCode.put("衡水市", new String[]{"0318"});
            cityCode.put("邢台市", new String[]{"0319"});
            cityCode.put("秦皇岛", new String[]{"0335"});

            // 浙江省
            cityCode.put("浙江省", new String[]{"0571", "33"});
            cityCode.put("杭州市", new String[]{"0571", "33"});
            cityCode.put("衢州市", new String[]{"0570"});
            cityCode.put("湖州市", new String[]{"0572"});
            cityCode.put("嘉兴市", new String[]{"0573"});
            cityCode.put("宁波市", new String[]{"0574"});
            cityCode.put("绍兴市", new String[]{"0575"});
            cityCode.put("台州市", new String[]{"0576"});
            cityCode.put("温州市", new String[]{"0577"});
            cityCode.put("丽水市", new String[]{"0578"});
            cityCode.put("金华市", new String[]{"0579"});
            cityCode.put("舟山市", new String[]{"0580"});

            // 辽宁省
            cityCode.put("辽宁省", new String[]{"024", "21"});
            cityCode.put("沈阳市", new String[]{"024", "21"});
            cityCode.put("铁岭市", new String[]{"0410"});
            cityCode.put("大连市", new String[]{"0411"});
            cityCode.put("鞍山市", new String[]{"0412"});
            cityCode.put("抚顺市", new String[]{"0413"});
            cityCode.put("本溪市", new String[]{"0414"});
            cityCode.put("丹东市", new String[]{"0415"});
            cityCode.put("锦州市", new String[]{"0416"});
            cityCode.put("营口市", new String[]{"0417"});
            cityCode.put("阜新市", new String[]{"0418"});
            cityCode.put("辽阳市", new String[]{"0419"});
            cityCode.put("朝阳市", new String[]{"0421"});
            cityCode.put("盘锦市", new String[]{"0427"});
            cityCode.put("葫芦岛", new String[]{"0429"});

            // 湖北省
            cityCode.put("湖北省", new String[]{"027", "42"});
            cityCode.put("武汉市", new String[]{"027", "42"});
            cityCode.put("襄城市", new String[]{"0710"});
            cityCode.put("鄂州市", new String[]{"0711"});
            cityCode.put("孝感市", new String[]{"0712"});
            cityCode.put("黄州市", new String[]{"0713"});
            cityCode.put("黄石市", new String[]{"0714"});
            cityCode.put("咸宁市", new String[]{"0715"});
            cityCode.put("荆沙市", new String[]{"0716"});
            cityCode.put("宜昌市", new String[]{"0717"});
            cityCode.put("恩施市", new String[]{"0718"});
            cityCode.put("十堰市", new String[]{"0719"});
            cityCode.put("随枣市", new String[]{"0722"});
            cityCode.put("荆门市", new String[]{"0724"});
            cityCode.put("江汉市", new String[]{"0728"});

            // 江苏省
            cityCode.put("江苏省", new String[]{"025", "32"});
            cityCode.put("南京市", new String[]{"025", "32"});
            cityCode.put("无锡市", new String[]{"0510"});
            cityCode.put("镇江市", new String[]{"0511"});
            cityCode.put("苏州市", new String[]{"0512", "32"});
            cityCode.put("南通市", new String[]{"0513"});
            cityCode.put("扬州市", new String[]{"0514"});
            cityCode.put("盐城市", new String[]{"0515"});
            cityCode.put("徐州市", new String[]{"0516"});
            cityCode.put("淮阴市", new String[]{"0517"});
            cityCode.put("淮安市", new String[]{"0517"});
            cityCode.put("连云港", new String[]{"0518"});
            cityCode.put("常州市", new String[]{"0519"});
            cityCode.put("泰州市", new String[]{"0523"});

            // 内蒙古
            cityCode.put("内蒙古", new String[]{"0471", "15"});
            cityCode.put("呼和浩特", new String[]{"0471", "15"});
            cityCode.put("乌鲁木齐", new String[]{"0991", "65"});
            cityCode.put("海拉尔", new String[]{"0470"});
            cityCode.put("包头市", new String[]{"0472"});
            cityCode.put("乌海市", new String[]{"0473"});
            cityCode.put("集宁市", new String[]{"0474"});
            cityCode.put("通辽市", new String[]{"0475"});
            cityCode.put("赤峰市", new String[]{"0476"});
            cityCode.put("东胜市", new String[]{"0477"});
            cityCode.put("临河市", new String[]{"0478"});
            cityCode.put("锡林浩特", new String[]{"0479"});
            cityCode.put("乌兰浩特", new String[]{"0482"});
            cityCode.put("阿拉善左旗", new String[]{"0483"});

            // 江西省
            cityCode.put("江西省", new String[]{"0791", "36"});
            cityCode.put("南昌市", new String[]{"0791", "36"});
            cityCode.put("新余市", new String[]{"0790"});
            cityCode.put("九江市", new String[]{"0792"});
            cityCode.put("上饶市", new String[]{"0793"});
            cityCode.put("临川市", new String[]{"0794"});
            cityCode.put("宜春市", new String[]{"0795"});
            cityCode.put("吉安市", new String[]{"0796"});
            cityCode.put("赣州市", new String[]{"0797"});
            cityCode.put("景德镇", new String[]{"0798"});
            cityCode.put("萍乡市", new String[]{"0799"});
            cityCode.put("鹰潭市", new String[]{"0701"});

            // 山西省
            cityCode.put("山西省", new String[]{"0351", "14"});
            cityCode.put("太原市", new String[]{"0351", "14"});
            cityCode.put("忻州市", new String[]{"0350"});
            cityCode.put("大同市", new String[]{"0352"});
            cityCode.put("阳泉市", new String[]{"0353"});
            cityCode.put("榆次市", new String[]{"0354"});
            cityCode.put("长治市", new String[]{"0355"});
            cityCode.put("晋城市", new String[]{"0356"});
            cityCode.put("临汾市", new String[]{"0357"});
            cityCode.put("离石市", new String[]{"0358"});
            cityCode.put("运城市", new String[]{"0359"});

            // 甘肃省
            cityCode.put("甘肃省", new String[]{"0931", "62"});
            cityCode.put("兰州市", new String[]{"0931", "62"});
            cityCode.put("临夏市", new String[]{"0930"});
            cityCode.put("定西市", new String[]{"0932"});
            cityCode.put("平凉市", new String[]{"0933"});
            cityCode.put("西峰市", new String[]{"0934"});
            cityCode.put("武威市", new String[]{"0935"});
            cityCode.put("张掖市", new String[]{"0936"});
            cityCode.put("酒泉市", new String[]{"0937"});
            cityCode.put("天水市", new String[]{"0938"});
            cityCode.put("甘南州", new String[]{"0941"});
            cityCode.put("白银市", new String[]{"0943"});

            // 山东省
            cityCode.put("山东省", new String[]{"0531", "37"});
            cityCode.put("济南市", new String[]{"0531", "37"});
            cityCode.put("菏泽市", new String[]{"0530"});
            cityCode.put("青岛市", new String[]{"0532"});
            cityCode.put("淄博市", new String[]{"0533"});
            cityCode.put("德州市", new String[]{"0534"});
            cityCode.put("烟台市", new String[]{"0535"});
            cityCode.put("淮坊市", new String[]{"0536"});
            cityCode.put("济宁市", new String[]{"0537"});
            cityCode.put("泰安市", new String[]{"0538"});
            cityCode.put("临沂市", new String[]{"0539"});

            // 黑龙江
            cityCode.put("黑龙江", new String[]{"0451", "23"});
            cityCode.put("哈尔滨", new String[]{"0451", "23"});
            cityCode.put("阿城市", new String[]{"0450"});
            cityCode.put("齐齐哈尔", new String[]{"0452"});
            cityCode.put("牡丹江", new String[]{"0453"});
            cityCode.put("佳木斯", new String[]{"0454"});
            cityCode.put("绥化市", new String[]{"0455"});
            cityCode.put("黑河市", new String[]{"0456"});
            cityCode.put("加格达奇", new String[]{"0457"});
            cityCode.put("伊春市", new String[]{"0458"});
            cityCode.put("大庆市", new String[]{"0459"});

            // 福建省
            cityCode.put("福建省", new String[]{"0591", "0"});
            cityCode.put("福州市", new String[]{"0591", "0"});
            cityCode.put("厦门市", new String[]{"0592"});
            cityCode.put("宁德市", new String[]{"0593"});
            cityCode.put("莆田市", new String[]{"0594"});
            cityCode.put("泉州市", new String[]{"0595"});
            cityCode.put("晋江市", new String[]{"0595"});
            cityCode.put("漳州市", new String[]{"0596"});
            cityCode.put("龙岩市", new String[]{"0597"});
            cityCode.put("三明市", new String[]{"0598"});
            cityCode.put("南平市", new String[]{"0599"});

            // 广东省
            cityCode.put("广东省", new String[]{"020", "44"});
            cityCode.put("广州市", new String[]{"020", "44"});
            cityCode.put("韶关市", new String[]{"0751"});
            cityCode.put("惠州市", new String[]{"0752"});
            cityCode.put("梅州市", new String[]{"0753"});
            cityCode.put("汕头市", new String[]{"0754"});
            cityCode.put("深圳市", new String[]{"0755"});
            cityCode.put("珠海市", new String[]{"0756"});
            cityCode.put("佛山市", new String[]{"0757"});
            cityCode.put("肇庆市", new String[]{"0758"});
            cityCode.put("湛江市", new String[]{"0759"});
            cityCode.put("中山市", new String[]{"0760"});
            cityCode.put("河源市", new String[]{"0762"});
            cityCode.put("清远市", new String[]{"0763"});
            cityCode.put("顺德市", new String[]{"0765"});
            cityCode.put("云浮市", new String[]{"0766"});
            cityCode.put("潮州市", new String[]{"0768"});
            cityCode.put("东莞市", new String[]{"0769"});
            cityCode.put("汕尾市", new String[]{"0660"});
            cityCode.put("潮阳市", new String[]{"0661"});
            cityCode.put("阳江市", new String[]{"0662"});
            cityCode.put("揭西市", new String[]{"0663"});

            // 四川省
            cityCode.put("四川省", new String[]{"028", "51"});
            cityCode.put("成都市", new String[]{"028", "51"});
            cityCode.put("涪陵市", new String[]{"0810"});
            cityCode.put("重庆市", new String[]{"0811"});
            cityCode.put("攀枝花", new String[]{"0812"});
            cityCode.put("自贡市", new String[]{"0813"});
            cityCode.put("永川市", new String[]{"0814"});
            cityCode.put("绵阳市", new String[]{"0816"});
            cityCode.put("南充市", new String[]{"0817"});
            cityCode.put("达县市", new String[]{"0818"});
            cityCode.put("万县市", new String[]{"0819"});
            cityCode.put("遂宁市", new String[]{"0825"});
            cityCode.put("广安市", new String[]{"0826"});
            cityCode.put("巴中市", new String[]{"0827"});
            cityCode.put("泸州市", new String[]{"0830"});
            cityCode.put("宜宾市", new String[]{"0831"});
            cityCode.put("内江市", new String[]{"0832"});
            cityCode.put("乐山市", new String[]{"0833"});
            cityCode.put("西昌市", new String[]{"0834"});
            cityCode.put("雅安市", new String[]{"0835"});
            cityCode.put("康定市", new String[]{"0836"});
            cityCode.put("马尔康", new String[]{"0837"});
            cityCode.put("德阳市", new String[]{"0838"});
            cityCode.put("广元市", new String[]{"0839"});
            cityCode.put("泸州市", new String[]{"0840"});

            // 湖南省
            cityCode.put("湖南省", new String[]{"0731", "43"});
            cityCode.put("长沙市", new String[]{"0731", "43"});
            cityCode.put("岳阳市", new String[]{"0730"});
            cityCode.put("湘潭市", new String[]{"0732"});
            cityCode.put("株州市", new String[]{"0733"});
            cityCode.put("衡阳市", new String[]{"0734"});
            cityCode.put("郴州市", new String[]{"0735"});
            cityCode.put("常德市", new String[]{"0736"});
            cityCode.put("益阳市", new String[]{"0737"});
            cityCode.put("娄底市", new String[]{"0738"});
            cityCode.put("邵阳市", new String[]{"0739"});
            cityCode.put("吉首市", new String[]{"0743"});
            cityCode.put("张家界", new String[]{"0744"});
            cityCode.put("怀化市", new String[]{"0745"});
            cityCode.put("永州冷", new String[]{"0746"});

            // 河南省
            cityCode.put("河南省", new String[]{"0371", "41"});
            cityCode.put("郑州市", new String[]{"0371", "41"});
            cityCode.put("商丘市", new String[]{"0370"});
            cityCode.put("安阳市", new String[]{"0372"});
            cityCode.put("新乡市", new String[]{"0373"});
            cityCode.put("许昌市", new String[]{"0374"});
            cityCode.put("平顶山", new String[]{"0375"});
            cityCode.put("信阳市", new String[]{"0376"});
            cityCode.put("南阳市", new String[]{"0377"});
            cityCode.put("开封市", new String[]{"0378"});
            cityCode.put("洛阳市", new String[]{"0379"});
            cityCode.put("焦作市", new String[]{"0391"});
            cityCode.put("鹤壁市", new String[]{"0392"});
            cityCode.put("濮阳市", new String[]{"0393"});
            cityCode.put("周口市", new String[]{"0394"});
            cityCode.put("漯河市", new String[]{"0395"});
            cityCode.put("驻马店", new String[]{"0396"});
            cityCode.put("三门峡", new String[]{"0398"});

            // 云南省
            cityCode.put("云南省", new String[]{"0871", "53"});
            cityCode.put("昆明市", new String[]{"0871", "53"});
            cityCode.put("昭通市", new String[]{"0870"});
            cityCode.put("大理市", new String[]{"0872"});
            cityCode.put("个旧市", new String[]{"0873"});
            cityCode.put("曲靖市", new String[]{"0874"});
            cityCode.put("保山市", new String[]{"0875"});
            cityCode.put("文山市", new String[]{"0876"});
            cityCode.put("玉溪市", new String[]{"0877"});
            cityCode.put("楚雄市", new String[]{"0878"});
            cityCode.put("思茅市", new String[]{"0879"});
            cityCode.put("景洪市", new String[]{"0691"});
            cityCode.put("潞西市", new String[]{"0692"});
            cityCode.put("东川市", new String[]{"0881"});
            cityCode.put("临沧市", new String[]{"0883"});
            cityCode.put("六库市", new String[]{"0886"});
            cityCode.put("中甸市", new String[]{"0887"});
            cityCode.put("丽江市", new String[]{"0888"});

            // 安徽省
            cityCode.put("安徽省", new String[]{"0551", "34"});
            cityCode.put("合肥市", new String[]{"0551", "34"});
            cityCode.put("滁州市", new String[]{"0550"});
            cityCode.put("蚌埠市", new String[]{"0552"});
            cityCode.put("芜湖市", new String[]{"0553"});
            cityCode.put("淮南市", new String[]{"0554"});
            cityCode.put("马鞍山", new String[]{"0555"});
            cityCode.put("安庆市", new String[]{"0556"});
            cityCode.put("宿州市", new String[]{"0557"});
            cityCode.put("阜阳市", new String[]{"0558"});
            cityCode.put("黄山市", new String[]{"0559"});
            cityCode.put("淮北市", new String[]{"0561"});
            cityCode.put("铜陵市", new String[]{"0562"});
            cityCode.put("宣城市", new String[]{"0563"});
            cityCode.put("六安市", new String[]{"0564"});
            cityCode.put("巢湖市", new String[]{"0565"});
            cityCode.put("贵池市", new String[]{"0566"});

            // 宁夏
            cityCode.put("宁夏", new String[]{"0951", "64"});
            cityCode.put("银川市", new String[]{"0951", "64"});
            cityCode.put("石嘴山", new String[]{"0952"});
            cityCode.put("吴忠市", new String[]{"0953"});
            cityCode.put("固原市", new String[]{"0954"});

            // 吉林省
            cityCode.put("吉林省", new String[]{"0431", "22"});
            cityCode.put("长春市", new String[]{"0431", "22"});
            cityCode.put("吉林市", new String[]{"0432"});
            cityCode.put("延吉市", new String[]{"0433"});
            cityCode.put("四平市", new String[]{"0434"});
            cityCode.put("通化市", new String[]{"0435"});
            cityCode.put("白城市", new String[]{"0436"});
            cityCode.put("辽源市", new String[]{"0437"});
            cityCode.put("松原市", new String[]{"0438"});
            cityCode.put("浑江市", new String[]{"0439"});
            cityCode.put("珲春市", new String[]{"0440"});

            // 广西省
            cityCode.put("广西省", new String[]{"0771", "45"});
            cityCode.put("南宁市", new String[]{"0771", "45"});
            cityCode.put("防城港", new String[]{"0770"});
            cityCode.put("柳州市", new String[]{"0772"});
            cityCode.put("桂林市", new String[]{"0773"});
            cityCode.put("梧州市", new String[]{"0774"});
            cityCode.put("玉林市", new String[]{"0775"});
            cityCode.put("百色市", new String[]{"0776"});
            cityCode.put("钦州市", new String[]{"0777"});
            cityCode.put("河池市", new String[]{"0778"});
            cityCode.put("北海市", new String[]{"0779"});

            // 贵州省
            cityCode.put("贵州省", new String[]{"0851", "52"});
            cityCode.put("贵阳市", new String[]{"0851", "52"});
            cityCode.put("遵义市", new String[]{"0852"});
            cityCode.put("安顺市", new String[]{"0853"});
            cityCode.put("都均市", new String[]{"0854"});
            cityCode.put("凯里市", new String[]{"0855"});
            cityCode.put("铜仁市", new String[]{"0856"});
            cityCode.put("毕节市", new String[]{"0857"});
            cityCode.put("六盘水", new String[]{"0858"});
            cityCode.put("兴义市", new String[]{"0859"});

            // 陕西省
            cityCode.put("陕西省", new String[]{"029", "61"});
            cityCode.put("西安市", new String[]{"029", "61"});
            cityCode.put("咸阳市", new String[]{"0910"});
            cityCode.put("延安市", new String[]{"0911"});
            cityCode.put("榆林市", new String[]{"0912"});
            cityCode.put("渭南市", new String[]{"0913"});
            cityCode.put("商洛市", new String[]{"0914"});
            cityCode.put("安康市", new String[]{"0915"});
            cityCode.put("汉中市", new String[]{"0916"});
            cityCode.put("宝鸡市", new String[]{"0917"});
            cityCode.put("铜川市", new String[]{"0919"});

            // 青海省
            cityCode.put("青海省", new String[]{"0971", "63"});
            cityCode.put("西宁市", new String[]{"0971", "63"});
            cityCode.put("海东市", new String[]{"0972"});
            cityCode.put("同仁市", new String[]{"0973"});
            cityCode.put("共和市", new String[]{"0974"});
            cityCode.put("玛沁市", new String[]{"0975"});
            cityCode.put("玉树市", new String[]{"0976"});
            cityCode.put("德令哈", new String[]{"0977"});

            // 海南省
            cityCode.put("海南省", new String[]{"0898", "46"});
            cityCode.put("海口市", new String[]{"0898", "46"});
            cityCode.put("儋州市", new String[]{"0890"});
            cityCode.put("三亚市", new String[]{"0899"});

            // 西藏
            cityCode.put("西藏", new String[]{"0891", "54"});
            cityCode.put("拉萨市", new String[]{"0891", "54"});
            cityCode.put("日喀则", new String[]{"0892"});
            cityCode.put("山南市", new String[]{"0893"});
        }
        return cityCode;
    }
}
