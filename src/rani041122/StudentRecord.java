/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rani041122;

/**
 *
 * @author lenovo
 */
public class StudentRecord {
     private String name; 
        private String address; 
        private int age; 
        private double mathGrade; 
        private double englishGrade; 
        private double scienceGrade; 
        private double average; 
        
        private static int studentCount;
         
        public String getAddress(){ 
            return address; 
        } 
        
        public void setAddress( String address ){ 
             this. address = address; 
        } 
        
        public String getName(){ 
            return name; 
        } 
        
        public void setName( String name ){ 
             this. name = name; 
        } 
       
        public double getAge(){ 
            return age; 
        } 
        
        public void setAge( int age ){ 
             this. age = age; 
        } 
        
        public double getEnglishGrade(){ 
            return englishGrade; 
        } 
        
        public void setEnglishGrade( double englishGrade ){ 
             this. englishGrade = englishGrade; 
        } 
        
        
        public double getMathGrade(){ 
            return mathGrade; 
        } 
        
        public void setMathGrade( double mathGrade ){ 
             this. mathGrade = mathGrade; 
        } 
        
        
        public double getScienceGrade(){ 
            return scienceGrade; 
        } 
        
        public void setScienceGrade( double scienceGrade ){ 
             this. scienceGrade = scienceGrade; 
        } 
        
        
        public double getAverage() { 
            average = ( mathGrade + englishGrade + scienceGrade);
            return average; 
        } 
        
        
       public int getStudentCount(){
       return studentCount;
           }
       public StudentRecord() {
        
    }
    
    public StudentRecord(String temp){
        this.name=temp;
    } 
    
    public StudentRecord(String name,String address){
        this.name=name;
        this.address=address;
    }
    public StudentRecord(double mGrade, double eGrade,double sGrade){
        mathGrade=mGrade;
        englishGrade=eGrade;
        scienceGrade=sGrade;
        
    }
        
        
        
}
