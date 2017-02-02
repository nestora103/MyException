package ru.geekbrains.java2.dz.dz1.gubenkoDM;

import java.util.regex.Pattern;

/**
 * Created by Nestor on 29.11.2016.
 */
public class StringParser {
    private String inputStr;

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }

    private int arraySize;
    public String getInputStr() {
        return inputStr;
    }
    public StringParser(String inputStr,int arraySize) {
        this.inputStr=inputStr;
        this.arraySize=arraySize;
    }

    public String parse() throws MyException{
        //разбивка нашей строки на массив
        //String[] strArr=getInputStr().split("\n| "); --перегонка в одномерный
        String[] strArr=getInputStr().split(Pattern.quote("\\n"));



        //String[] strArr=getInputStr().split("\\n");
        //String[] strArr="1 3 1 2\n2 3 2 2\n5 6 7 1\n3 3 1 0".split("\\n");


        if (strArr.length>getArraySize()){
            throw new MyException("Размер матрицы не соответствует формату 4x4!");
        }
        String[][] strArr2=new String[getArraySize()][getArraySize()];
        for (int i = 0; i <strArr.length; i++) {
            if (strArr[i].split(" ").length>getArraySize()){
                throw new MyException("Размер матрицы не соответствует формату 4x4!");
            }
            strArr2[i]=strArr[i].split(" ");
        }
        int acum=0;
        for (int i = 0; i <strArr2.length; i++) {
            for (int j = 0; j <strArr2[0].length; j++) {
               try{
                   acum+=Integer.parseInt(strArr2[i][j]);
               }catch (NumberFormatException e){
                   throw new MyException("Вместо цифр введены символы или строки!");
               }

            }
        }
        return "Сумма всех чисел строки деленная на 2: ".concat(String.valueOf(acum/2));
    }
}
