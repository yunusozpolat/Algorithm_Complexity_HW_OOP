/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Kuba {
    private int Currency;
    
    public void Add(Kuba newKuba) {
        String s = Integer.toString(newKuba.Currency);
        String[] sArray = s.split("");
        int[] sArray2 = new int[s.length()];
        int number = 0;
        int index  = 0;
        for(int i = s.length() -1 ; i >=0 ; i-- ){
            number = Integer.parseInt(sArray[i]) * (int)Math.pow(7,index);
            sArray2[index] = number;
            index++;
        }
        String s1 = Integer.toString(this.Currency);
        String[] sArray1 = s1.split("");
        int[] sArray3 = new int[s1.length()];
        int number1 = 0;
        int index1  = 0;
        for(int i = s1.length() -1  ; i >= 0; i-- ){
            number1 = Integer.parseInt(sArray1[i]) * (int)Math.pow(7,index1);
            sArray3[index1] = number1;
            index1++;
        }
        int sum1  = 0;
        for(int i = 0; i < sArray2.length; i++){
            sum1 += sArray2[i];
        }
        int sum2  = 0;
        for(int i = 0; i < sArray3.length; i++){
            sum2 += sArray3[i];
        }
        int allSum = sum1 + sum2;
        String stringCurrency = Integer.toString(allSum);
        int division = allSum / 7;
        int mod = allSum % 7;
        int[] arrayKubaCurrency = new int[7];
        arrayKubaCurrency[0] = mod;
        int arrayKubaCurrencyIndex = 1;
        while (arrayKubaCurrencyIndex < arrayKubaCurrency.length) {
            if (division < 7) {
                arrayKubaCurrency[arrayKubaCurrencyIndex] = division;
                break;
            } else {
                mod = division % 7;
                division = division / 7;
                arrayKubaCurrency[arrayKubaCurrencyIndex] = mod;
            }
            arrayKubaCurrencyIndex++;
        }
        int[] intArray = new int[7];
        for (int i = arrayKubaCurrency.length - 1; i >= 0; i--) {
            intArray[i] = arrayKubaCurrency[i];
        }
        String newCurrency = "";
        for(int i = intArray.length -1 ; i >= 0 ; i--){
            newCurrency += intArray[i];
        }
        int newCurrency2 = Integer.parseInt(newCurrency);
        this.Currency = newCurrency2;
        ShowCurrency();
    }
    public void Add(Galli newGalli) {
        int temp = Currency;
        String s = Integer.toString(newGalli.TakeCurrency(temp));
        String[] sArray = s.split("");
        int[] sArray2 = new int[s.length()];
        int number = 0;
        int index  = 0;
        for(int i = s.length() - 1 ; i >= 0 ; i-- ){
            number = Integer.parseInt(sArray[i]) * (int)Math.pow(9,index);
            sArray2[i] = number;
            index++;
        }
        String s1 = Integer.toString(this.Currency);
        String[] sArray1 = s1.split("");
        int[] sArray3 = new int[s1.length()];
        int number1 = 0;
        int index1  = 0;
        for(int i = s1.length() - 1 ; i >= 0 ; i-- ){
            number1 = Integer.parseInt(sArray1[i]) * (int)Math.pow(7,index1);
            //System.out.println("N: " + number1);
            sArray3[i] = number1;
            index1++;
        }
        int sum1  = 0;
        for(int i = 0; i < sArray2.length; i++){
            sum1 += sArray2[i];
        }
        int newsumm1 = sum1 / 2;
        int sum2  = 0;
        for(int i = 0; i < sArray3.length; i++){
            sum2 += sArray3[i];
        }
        int allSum = newsumm1 + sum2;
        String stringCurrency = Integer.toString(allSum);
        int division = allSum / 7;
        int mod = allSum % 7;
        int[] arrayKubaCurrency = new int[7];
        arrayKubaCurrency[0] = mod;
        int arrayKubaCurrencyIndex = 1;
        while (arrayKubaCurrencyIndex < arrayKubaCurrency.length) {
            if (division < 7) {
                arrayKubaCurrency[arrayKubaCurrencyIndex] = division;
                break;
            } else {
                mod = division % 7;
                division = division / 7;
                arrayKubaCurrency[arrayKubaCurrencyIndex] = mod;
            }
            arrayKubaCurrencyIndex++;
        }
        int[] intArray = new int[7];
        for (int i = arrayKubaCurrency.length - 1; i >= 0; i--) {
            intArray[i] = arrayKubaCurrency[i];
        }
        String newCurrency = "";
        for(int i = intArray.length -1 ; i >= 0 ; i--){
            newCurrency += intArray[i];
        }
        int newCurrency2 = Integer.parseInt(newCurrency);
        this.Currency = newCurrency2;
        ShowCurrency();
    }
    public void GetCurrency() {
        Scanner input = new Scanner(System.in);
        while (true) {
            boolean isFeasibleKuba = true;
            System.out.print("Enter a kuba currency: ");
            int kubaInput = input.nextInt();
            String kubaCurrency = Integer.toString(kubaInput);
            String[] currencyArray = kubaCurrency.split("");
            for (int i = 0; i < kubaCurrency.length(); i++) {
                if (kubaCurrency.length() > 7 || currencyArray[i].equals("7")  || currencyArray[i].equals("8") || currencyArray[i].equals("9")) {
                    System.out.println("Error: Icorrect kuba currency. Please enter new kuba currency");
                    isFeasibleKuba = false;
                    break;
                }
            }
            if (isFeasibleKuba) {
                Currency = kubaInput;
                break;
            }
        }
    }
    public void GetCurrency(Integer newKuba) {
        String newKubacurrency = Integer.toString(newKuba);
        String[] newKubaCurrency = newKubacurrency.split("");
        for (int i = 0; i < newKubacurrency.length(); i++) {
            if (newKubacurrency.length() > 7 || newKubaCurrency[i].equals("7")  || newKubaCurrency[i].equals("8") || newKubaCurrency[i].equals("9")) {
                System.out.println("Error: Icorrect kuba currency. Please enter new kuba currency");
                break;
            }
        }
        this.Currency = newKuba;
    }
    public void ShowCurrency() {
        System.out.println(this.Currency);
    }
    public void Subtract(Kuba newKuba) {
        String s = Integer.toString(newKuba.Currency);
        String[] sArray = s.split("");
        int[] sArray2 = new int[s.length()];
        int number = 0;
        int index  = 0;
        for(int i = s.length() - 1  ; i >= 0 ; i-- ){
            number = Integer.parseInt(sArray[i]) * (int)Math.pow(7,index);
            sArray2[index] = number;
            index++;
        }
        String s1 = Integer.toString(this.Currency);
        String[] sArray1 = s1.split("");
        int[] sArray3 = new int[s1.length()];
        int number1 = 0;
        int index1  = 0;
        for(int i = s1.length() - 1 ; i >= 0 ; i-- ){
            number1 = Integer.parseInt(sArray1[i]) * (int)Math.pow(7,index1);
            sArray3[index1] = number1;
            index1++;
        }
        int sum1  = 0;
        for(int i = 0; i < sArray2.length; i++){
            sum1 += sArray2[i];
        }
        int sum2  = 0;
        for(int i = 0; i < sArray3.length; i++){
            sum2 += sArray3[i];
        }
        int allSum = 0;
        if(sum1 - sum2 < 0){
            allSum = sum2 - sum1;
        } else if (sum2 - sum1 < 0) {
            allSum = sum1 - sum2;
        }
        String stringCurrency = Integer.toString(allSum);
        int division = allSum / 7;
        int mod = allSum % 7;
        int[] arrayKubaCurrency = new int[7];
        arrayKubaCurrency[0] = mod;
        int arrayKubaCurrencyIndex = 1;
        while (arrayKubaCurrencyIndex < arrayKubaCurrency.length) {
            if (division < 7) {
                arrayKubaCurrency[arrayKubaCurrencyIndex] = division;
                break;
            } else {
                mod = division % 7;
                division = division / 7;
                arrayKubaCurrency[arrayKubaCurrencyIndex] = mod;
            }
            arrayKubaCurrencyIndex++;
        }
        int[] intArray = new int[7];
        for (int i = arrayKubaCurrency.length - 1; i >= 0; i--) {
            intArray[i] = arrayKubaCurrency[i];
        }
        String newCurrency = "";
        for(int i = intArray.length - 1; i >= 0 ; i--){
            newCurrency += intArray[i];
        }
        int newCurrency2 = Integer.parseInt(newCurrency);
        this.Currency = newCurrency2;
        ShowCurrency();
    }
    public Galli Convert() {
        Galli newGalli = new Galli();
        String s1 = Integer.toString(this.Currency);
        String[] sArray1 = s1.split("");
        int[] sArray3 = new int[s1.length()];
        int number1 = 0;
        int index1  = 0;
        for(int i = s1.length() - 1 ; i >= 0 ; i-- ){
            number1 = Integer.parseInt(sArray1[i]) * (int)Math.pow(7,index1);
            sArray3[index1] = number1;
            index1++;
        }
        int sum1  = 0;
        for(int i = 0; i < sArray3.length; i++){
            sum1 += sArray3[i];
        }
        int galli =  sum1 / 2;
        String stringCurrency = Integer.toString(galli);
        int division = galli / 9;
        int mod = galli % 9;
        int[] arrayKubaCurrency = new int[9];
        arrayKubaCurrency[0] = mod;
        int arrayKubaCurrencyIndex = 1;
        while (arrayKubaCurrencyIndex < arrayKubaCurrency.length) {
            if (division < 9) {
                arrayKubaCurrency[arrayKubaCurrencyIndex] = division;
                break;
            } else {
                mod = division % 9;
                division = division / 9;
                arrayKubaCurrency[arrayKubaCurrencyIndex] = mod;
            }
            arrayKubaCurrencyIndex++;
        }
        int[] intArray = new int[9];
        for (int i = arrayKubaCurrency.length - 1; i >= 0; i--) {
            intArray[i] = arrayKubaCurrency[i];
        }
        String newCurrency = "";
        for(int i = intArray.length - 1; i >= 0 ; i--){
            newCurrency += intArray[i];
        }
        int newCurrency2 = Integer.parseInt(newCurrency);
        newGalli.TakeCurrency(newCurrency2) ;
        return newGalli;
    }
    public int TakeCurrency(int Money){
        Currency = Money;
        return Currency;
    }
}
