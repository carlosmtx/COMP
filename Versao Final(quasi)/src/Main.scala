import invariant._
import java.util.Scanner

object Main {
  def main(args: Array[String]) {


    /*Demos - 0-100*/
    var input: InvariantDouble = new InvariantDouble(2);
    var x1:InvariantDouble = new InvariantDouble(2);
    var x2:InvariantDouble = new InvariantDouble(1);


    var b:InvariantDouble = new InvariantDouble(2);
    input.restrict("" +
      "var a=2+2;\n" +
      "var b=2+3;\n"+
      "$0=]@inf,@inf[\n",b);
   // var scan: Scanner = new java.util.Scanner(System.in)
    //input.evaluator.evaluate();
    input is -200





  }
}