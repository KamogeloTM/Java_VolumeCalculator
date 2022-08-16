/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumecalculatorapp;

/**
 *
 * @author Kamogelo Moatshe
 */
public class VolumeCalculator {

   private double height;
   private double length;
   private double breadth;
   private double volume;
   
   
   public VolumeCalculator(){
   
      height =0.0;
      length=0.0;
      breadth =0.0;
   
   }
   
   public void setHeight(double height){
     
       this.height = height;
   }
   
   public double getHeight(){
   
      return height;
   
   }
   
     public void setLength(double length){
     
       this.length = length;
   }
   
   public double getLength(){
   
      return length;
   
   }
     public void setBreadth(double breadth){
     
       this.breadth = breadth;
   }
   
   public double getBreadth(){
   
      return breadth;
   
   }
   
   public double calculateVolume(){
  
   volume = breadth*length*height;
   return volume;
   }
    public static void main(String[] args) {
        
        VolumeCalculator volumeCalculator = new VolumeCalculator();
        
        volumeCalculator.setBreadth(3);
        volumeCalculator.setHeight(3);
        volumeCalculator.setLength(3);
        
        System.out.println("The volume of :" + " length: " + volumeCalculator.getLength() + " breadth: " + 
                           volumeCalculator.getBreadth() + " height: " + volumeCalculator.getHeight() +  " is " 
                + volumeCalculator.calculateVolume());
    }
    
}
