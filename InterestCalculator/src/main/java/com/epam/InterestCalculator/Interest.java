package com.epam.InterestCalculator;

class Interest{
    double principle;
    double time;
    double rate;
    Interest(double p,double t,double r){
        this.principle=p;
        this.time=t;
        this.rate=r;
    }
    String getSimpleInterest(){
        return "Rs"+String.format("%.2f", (principle*time*rate)/100);
    }
    String getCompoundInterest(){
        return "Rs"+String.format("%.2f",principle * Math.pow(1.0+rate/100.0,time) - principle);
    }
}