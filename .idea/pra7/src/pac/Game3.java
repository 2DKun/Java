package pac;
import java.util.ArrayDeque;
import java.util.Deque;

public class Game3 {
    Deque<Integer> fp, sp;

    public Game3(String fp, String sp) {
        this.fp = new ArrayDeque<>();
        this.sp = new ArrayDeque<>();
        for(int i = 0; i < 5; i ++){
            this.fp.add(Integer.parseInt(fp.substring(i, i+1)));
            this.sp.add(Integer.parseInt(sp.substring(i, i+1)));
        }
    }

    public String play(){
        int count = 0;
        while(!fp.isEmpty() && !sp.isEmpty() && count < 106){
            if(fp.peek() > sp.peek() && sp.peek() != 0 || fp.peek()==0){
                fp.add(fp.remove());
                fp.add(sp.remove());

            }else{
                sp.add(fp.remove());
                sp.add(sp.remove());
            }
            count++;
        }
        String res = "";
        if (fp.isEmpty()) {
            res += "second "+ count;
        }
        else if(sp.isEmpty()){
            res += "first "+ count;
        } else if(count >= 106){
            res += "botva";
        }
        return res;
    }



}
