public class Solution {
    public String intToRoman(int num) {
        String[] thousands = {"","M","MM","MMM"};
        String[] hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] units = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        //Output: out
        String out=null;
        //Quotient: qot
        int qot;
        //Remainder: rem
        int rem;
        if(num<=3999){
            qot=num/1000;
            num=num%1000;
            out=thousands[qot];
        }
        if(num<1000){
            qot=num/100;
            num=num%100;
            out=out.concat(hundreds[qot]);
        }
        if(num<100){
            qot=num/10;
            num=num%10;
            out=out.concat(tens[qot]);
        }
        if(num<10){
            out=out.concat(units[num]);
        }
        return out;
    }
    //Another method: This method is more concise than previous one
    // public String intToRoman(int num) {
    //     String[] thousands = {"","M","MM","MMM"};
    //     String[] hundreds = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
    //     String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    //     String[] units = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
    //     if(num<3999){
    //         return thousands[num/1000]+hundreds[(num%1000)/100]+tens[(num%100)/10]+units[num%10];
    //     }
    //     return null;
    // }
}