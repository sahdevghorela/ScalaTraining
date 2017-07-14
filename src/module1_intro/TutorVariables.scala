package module1_intro

object TutorVariables extends App {

  // TODO define variable x equals 1
  // TODO define variable x1 of type int equals 1

  // TODO define variable f1 taking parameter a of type Int
  // TODO and returning a+"aaa"
  // TODO syntax: var f = (param:Type)=>code

  // TODO define value f2 taking parameter Int and returning square of a

  // TODO define f3 as def taking parameter Int and returning square of a
  // TODO syntax: def f=(param:type)=>code

  // TODO define f4 as def taking parameter Int and returning square of a
  // TODO syntax: def f(param:type)=code

  // TODO define f5 as value equal to f3

  // TODO why val f5 = f4 is not allowed?

  // TODO define value f6 by setting type of f6, like f6:(Type1)=>Type2
  // TODO assign f4 to f6, why this is allowed?

  // TODO use _ as a reference to first parameter
  // TODO try this:
  // val g0 = _+1 // why it is not allowed?
  // TODO define value g1 with setting its type, like f:Type1=>Type2
  // TODO use it to increment value by 1 with syntax _+1

  // TODO define type of parameter _ like this: (_:Int);
  // TODO define value g2 as function which increments parameter by 1
  // TODO (now you shouldn't define function type)

  // val vs. def?
  // Executing a definition such as def x = e
  // will not evaluate the expression e

  // val x = e evaluates the right-hand-side e as part
  // of the evaluation of the definition

  class A(a: Int) {
    val x = { println("x is set to something"); a }
    def y = { println("y is set to something"); a }
  }
  val aa = new A(1)
  println("now print values")
  println("a.x="+aa.x)
  println("a.y="+aa.y)

  // parenthless method
  def f7: Int = 1
  // Uniform access principle:
  // all services should be available through uniform notation
  // which does not betray whether they are implemented
  // through storage or computation
  // val f7 = 1
  // we can replace it by computation:
  val f8 = 1+1

}
