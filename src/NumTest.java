
public class NumTest {
  public static void main(String[] args) {
        NumOp nop = new NumOp(1032497);
        long tl = nop.removeFirst().toValue();					// tl=32497
        long tr = nop.removeFirst().reverse().toValue();				// tt=794230
        long od = nop.reverse().getFirst().toValue();    			// od=7
        long td = nop.reverse().removeFirst().getFirst().toValue();    		// td=9
        long hd = nop.reverse().removeFirst().removeFirst().getFirst().toValue();	        // hd=4
        System.out.println(tl+" "+tr+" "+od+" "+td+" "+hd);

          nop.CreateTotalDigitCube();
          nop.digit.SetNumber(6529347);
          long num1=nop.digit.calculate();  //num1=46656

          System.out.println(num1);

          NumOp nop1= new NumOp(923497820, new TotalDigitCube());
          nop1.digit.SetNumber(nop1.toValue());
          long num2=nop1.digit.calculate();  //num2=85184

          System.out.println(num2);

  }
}