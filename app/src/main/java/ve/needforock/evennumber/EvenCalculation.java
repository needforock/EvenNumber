package ve.needforock.evennumber;

/**
 * Created by Soporte on 21-Aug-17.
 */

public class EvenCalculation {
    EvenCallback evenCallback;

    public EvenCalculation(EvenCallback evenCallback) {
        this.evenCallback = evenCallback;
    }

    public void evenCalculation (String value){

        if(value.trim().length()>0){
            int auxValue = Integer.parseInt(value);

            if (auxValue %2 ==0){
                evenCallback.evenResult("par");
            }else {
                evenCallback.evenResult("impar");
            }

        }else{
            evenCallback.blankInput();

        }
    }
}
