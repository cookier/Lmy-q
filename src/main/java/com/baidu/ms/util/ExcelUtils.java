package com.baidu.ms.util;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.util.CellRangeAddress;
import org.springframework.stereotype.Component;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class ExcelUtils {
    private POIFSFileSystem fs;
    private HSSFWorkbook wb;
    private HSSFSheet sheet;
    private HSSFRow row;

    public POIFSFileSystem getFs() {
        return fs;
    }

    public void setFs(POIFSFileSystem fs) {
        this.fs = fs;
    }

    public HSSFWorkbook getWb() {
        return wb;
    }

    public void setWb(HSSFWorkbook wb) {
        this.wb = wb;
    }

    public HSSFSheet getSheet() {
        return sheet;
    }

    public void setSheet(HSSFSheet sheet) {
        this.sheet = sheet;
    }

    public HSSFRow getRow() {
        return row;
    }

    public void setRow(HSSFRow row) {
        this.row = row;
    }

    /**
     * 读取Excel表格表头的内容
     */
    public String[] readExcelTitle(InputStream is, int sheetIndex, int rowIndex) {
        try {
            fs = new POIFSFileSystem(is);
            wb = new HSSFWorkbook(fs);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet = wb.getSheetAt(sheetIndex);
        row = sheet.getRow(rowIndex);
        // 标题总列数
        int colNum = row.getPhysicalNumberOfCells();
        System.out.println("colNum:" + colNum);
        String[] title = new String[colNum];
        for (int i = 0; i < colNum; i++) {
            // title[i] = getStringCellValue(row.getCell((short) i));
            title[i] = getCellFormatValue(row.getCell((short) i));
        }
        return title;
    }

    /**
     * 读取Excel数据内容
     */
    public Map<Integer, String> readExcelContent(InputStream is) {
        Map<Integer, String> content = new HashMap<Integer, String>();
        String str = "";
        try {
            fs = new POIFSFileSystem(is);
            wb = new HSSFWorkbook(fs);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sheet = wb.getSheetAt(0);
        // 得到总行数
        int rowNum = sheet.getLastRowNum();
        row = sheet.getRow(0);
        int colNum = row.getPhysicalNumberOfCells();
        // 正文内容应该从第二行开始,第一行为表头的标题
        for (int i = 1; i <= rowNum; i++) {
            row = sheet.getRow(i);
            int j = 0;
            while (j < colNum) {
                // 每个单元格的数据内容用"-"分割开，以后需要时用String类的replace()方法还原数据
                // 也可以将每个单元格的数据设置到一个javabean的属性中，此时需要新建一个javabean
                // str += getStringCellValue(row.getCell((short) j)).trim() +
                // "-";
                str += getCellFormatValue(row.getCell((short) j)).trim() + "    ";
                j++;
            }
            content.put(i, str);
            str = "";
        }
        return content;
    }

    /**
     * 获取单元格数据内容为字符串类型的数据
     */
    private String getStringCellValue(HSSFCell cell) {
        String strCell = "";
        switch (cell.getCellType()) {
            case HSSFCell.CELL_TYPE_STRING:
                strCell = cell.getStringCellValue();
                break;
            case HSSFCell.CELL_TYPE_NUMERIC:
                strCell = String.valueOf(cell.getNumericCellValue());
                break;
            case HSSFCell.CELL_TYPE_BOOLEAN:
                strCell = String.valueOf(cell.getBooleanCellValue());
                break;
            case HSSFCell.CELL_TYPE_BLANK:
                strCell = "";
                break;
            default:
                strCell = "";
                break;
        }
        if (strCell.equals("") || strCell == null) {
            return "";
        }
        if (cell == null) {
            return "";
        }
        return strCell;
    }

    /**
     * 获取单元格数据内容为日期类型的数据
     *
     * @param cell Excel单元格
     * @return String 单元格数据内容
     */
    private String getDateCellValue(HSSFCell cell) {
        String result = "";
        try {
            int cellType = cell.getCellType();
            if (cellType == HSSFCell.CELL_TYPE_NUMERIC) {
                Date date = cell.getDateCellValue();
                result = (date.getYear() + 1900) + "-" + (date.getMonth() + 1) + "-" + date.getDate();
            } else if (cellType == HSSFCell.CELL_TYPE_STRING) {
                String date = getStringCellValue(cell);
                result = date.replaceAll("[年月]", "-").replace("日", "").trim();
            } else if (cellType == HSSFCell.CELL_TYPE_BLANK) {
                result = "";
            }
        } catch (Exception e) {
            System.out.println("日期格式不正确!");
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 根据HSSFCell类型设置数据
     *
     * @param cell
     * @return
     */
    private String getCellFormatValue(HSSFCell cell) {
        String cellvalue = "";
        if (cell != null) {
            // 判断当前Cell的Type
            switch (cell.getCellType()) {
                // 如果当前Cell的Type为NUMERIC
                case HSSFCell.CELL_TYPE_NUMERIC:
                case HSSFCell.CELL_TYPE_FORMULA: {
                    // 判断当前的cell是否为Date
                    if (HSSFDateUtil.isCellDateFormatted(cell)) {
                        // 如果是Date类型则，转化为Data格式

                        // 方法1：这样子的data格式是带时分秒的：2011-10-12 0:00:00
                        // cellvalue = cell.getDateCellValue().toLocaleString();

                        // 方法2：这样子的data格式是不带带时分秒的：2011-10-12
                        Date date = cell.getDateCellValue();
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        cellvalue = sdf.format(date);

                    }
                    // 如果是纯数字
                    else {
                        // 取得当前Cell的数值
                        cellvalue = String.valueOf(cell.getNumericCellValue());
                    }
                    break;
                }
                // 如果当前Cell的Type为STRIN
                case HSSFCell.CELL_TYPE_STRING:
                    // 取得当前的Cell字符串
                    cellvalue = cell.getRichStringCellValue().getString();
                    break;
                // 默认的Cell值
                default:
                    cellvalue = " ";
            }
        } else {
            cellvalue = "";
        }
        return cellvalue;

    }

    /**
     * 创建文件系统
     *
     * @param is
     * @return
     */
    public POIFSFileSystem createPOIFS(InputStream is) {
        POIFSFileSystem fs = null;
        try {
            fs = new POIFSFileSystem(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fs;
    }

    /**
     * 创建工作簿
     *
     * @param poifs
     * @return
     */
    public HSSFWorkbook createWorkbook(POIFSFileSystem poifs) {
        HSSFWorkbook workbook = null;
        try {
            workbook = new HSSFWorkbook(poifs);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return workbook;
    }

    /**
     * 创建sheet
     *
     * @param sheetname
     */
    public HSSFSheet createSheet(String sheetname) {
        return wb.createSheet(sheetname);
    }

    /**
     * 创建行
     *
     * @param sheet
     * @param rowIndex
     * @return
     */
    public HSSFRow createRow(HSSFSheet sheet, int rowIndex) {
        return sheet.createRow(rowIndex);
    }

    /**
     * 创建单元格
     *
     * @param sheet
     * @param rowIndex
     * @param colIndex
     * @return
     */
    public HSSFCell createCell(HSSFSheet sheet, int rowIndex, int colIndex) {
        return sheet.createRow(rowIndex).createCell(colIndex);
    }

    /**
     * 单元格写数据
     *
     * @param cell
     * @param type
     * @param vlaue
     */
    public HSSFCell writeCell(HSSFCell cell, int type, String vlaue) {
        cell.setCellType(type);
        cell.setCellValue(vlaue);
        return cell;
    }

    /**
     * 保存到输出流
     *
     * @param os
     */
    public void writeOSStream(HSSFWorkbook wk, OutputStream os) {
        try {
            if (wk != null && os != null)
                wk.write(os);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获得单元格
     *
     * @param sheet
     * @param rowIndex
     * @param colIndex
     * @return
     */
    public HSSFCell getCell(HSSFSheet sheet, int rowIndex, int colIndex) {
        return sheet.getRow(rowIndex).getCell(colIndex);
    }

    /**
     * 获得行
     *
     * @param sheet
     * @param rowIndex
     * @return
     */
    public HSSFRow getRow(HSSFSheet sheet, int rowIndex) {
        return sheet.getRow(rowIndex);
    }

    /**
     * 合并单元格
     *
     * @param sheet
     * @param firstRow
     * @param lastRow
     * @param firstColumn
     * @param lastColumn
     * @return
     */
    public int mergedRegion(HSSFSheet sheet, int firstRow, int lastRow, int firstColumn, int lastColumn) {
        return sheet.addMergedRegion(new CellRangeAddress(firstRow, lastRow, firstColumn, lastColumn));
    }

    /**
     * 关闭工作簿
     */
    public void closeWorkbook(HSSFWorkbook workbook) {
        if (workbook != null) {
            try {
                workbook.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 关闭文件流
     *
     * @param poifs
     */
    public void closeFileStream(POIFSFileSystem poifs) {
        if (poifs != null) {
            try {
                poifs.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            // 对读取Excel表格标题测试
            InputStream is = new FileInputStream("d:\\order_template.xls");
            ExcelUtils excelReader = new ExcelUtils();
            // String[] title = excelReader.readExcelTitle(is, 0, 0);
            // System.out.println("获得Excel表格的标题:");
            // for (String s : title) {
            // System.out.print(s + " ");
            // }

            // System.out.println("");
            // 对读取Excel表格内容测试
            // InputStream is2 = new FileInputStream("d:\\order_template.xls");
            // Map<Integer, String> map = excelReader.readExcelContent(is2);
            // System.out.println("获得Excel表格的内容:");
            // for (int i = 1; i <= map.size(); i++) {
            // System.out.println(map.get(i));
            // }

            POIFSFileSystem fs = excelReader.createPOIFS(is);
            HSSFWorkbook wk = excelReader.createWorkbook(fs);
            HSSFSheet sheet = wk.getSheetAt(0);
            for (int rowIndex = 2; rowIndex < 1000; rowIndex++) {
                HSSFRow row = sheet.createRow(rowIndex);
                for (int colIndex = 0; colIndex < 14; colIndex++) {
                    HSSFCell cell = row.createCell(colIndex);
                    excelReader.writeCell(cell, HSSFCell.CELL_TYPE_STRING, "row-" + rowIndex + "-col-" + colIndex);
                }
                if (rowIndex == 10)
                    excelReader.mergedRegion(sheet, 5, 10, 5, 8);
            }

            FileOutputStream fos = new FileOutputStream(new File("d:\\order_template12.xls"));
            try {
                excelReader.writeOSStream(wk, fos);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
            try {
                fos.close();
                wk.close();
                fs.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            System.out.println("未找到指定路径的文件!");
            e.printStackTrace();
        }
    }

}
