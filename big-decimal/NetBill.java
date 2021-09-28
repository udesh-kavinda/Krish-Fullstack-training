import java.math.BigDecimal;

public class NetBill{



        public static void main(String args[]){

            // using big decimal
           BigDecimal Rental = new BigDecimal("1549.34");
           BigDecimal Previous_Due_Amount= new BigDecimal("-50.4");
           BigDecimal Sub_total= new BigDecimal(Rental.add(Previous_Due_Amount).toString());


            //vas
           BigDecimal VAS_Charges= new BigDecimal("2.47");
           BigDecimal DAYS= new BigDecimal("30");
           BigDecimal Total_VAS_Charges= new BigDecimal(VAS_Charges.multiply(DAYS).toString());


            //vat
            BigDecimal VAT= new BigDecimal("2.478");
            

            //Government_Taxes_and_Levies
            BigDecimal CESS= new BigDecimal("102.4");
            BigDecimal Recovery_in_Lieu_of_NBT_for_Intnet_Serv= new BigDecimal("1202.4");
            BigDecimal Total_Government_Taxes_and_Levies= new BigDecimal(CESS.add(Recovery_in_Lieu_of_NBT_for_Intnet_Serv).toString());

            //Total
            BigDecimal Total= new BigDecimal(Sub_total.add(Total_VAS_Charges.add(VAT).add(Total_Government_Taxes_and_Levies)).toString());


            System.out.println("          Internet bill");
            System.out.println("    -----------------------");
            System.out.println("Rental (Rs)                                 :" + Rental);
            System.out.println("Previous_Due_Amount (Rs)                    :" + Previous_Due_Amount);
            System.out.println("Total_VAS_Charges (Rs)                      :" + Total_VAS_Charges);
            System.out.println("Total_Government_Taxes_and_Levies (Rs)      :" + Total_Government_Taxes_and_Levies);
            System.out.println("Total VAT (Rs)                              :" +VAT);
            System.out.println("Total Amount (Rs)                           :" +Total );
            
        }
}


