package codingExerciae;

public class Tip {

	   private int serviceQuality;

	  
	   public Tip(int serviceQuality) {

	       this.serviceQuality = serviceQuality;

	   }
	  
	   //Define & calculate tip w/ total bill
	   public double calculateTip(double bill) {

	       double tip = 0;

	       if(serviceQuality == 1) {

	           tip = 0.16 * bill;

	       } else if(serviceQuality == 2) {

	           tip = 0.22 * bill;

	       } else if(serviceQuality == 3) {

	           tip = 0.26 * bill;

	       }

	       return tip;

	   }

	}
