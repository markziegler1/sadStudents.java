package SadStudents;

public class Test {
  sadStudents William = new sadStudents(5, 0);
  sadStudents Ebus = new sadStudents(10, 0);
  sadStudents Mark = new sadStudents(-20, 0);
  void go () {
    studentActions();
    System.out.println("Ebus' expected exam grade is: " + Ebus.getExpectedExamGrade());
    System.out.println("His level of engagement: " + Ebus.getLevelOfEngagement() + "\n");
    System.out.println("William's expected exam grade is: " + William.getExpectedExamGrade());
    System.out.println("His level of engagement: " + William.getLevelOfEngagement() + "\n");
    System.out.println("Mark's expected exam grade is: " + Mark.getExpectedExamGrade());
    System.out.println("His level of engagement: " + Mark.getLevelOfEngagement() + "\n");




  }
  void studentActions () {
    William.ignoreTeachersInspirationalMoves();
    William.lookLikeAZombie();
    William.lookLikeAZombie();
    William.shoutLikeCrazy();
    William.shoutLikeCrazy();
    William.danceLikeCrazy();

    Ebus.danceLikeCrazy();
    Ebus.danceLikeCrazy();
    Ebus.danceLikeCrazy();
    Ebus.shoutLikeCrazy();
    Ebus.ignoreTeachersInspirationalMoves();
    Ebus.ignoreTeachersInspirationalMoves();

    Mark.ignoreTeachersInspirationalMoves();
    Mark.lookLikeAZombie();
    Mark.lookLikeAZombie();
    Mark.lookLikeAZombie();
    Mark.shoutLikeCrazy();
    Mark.danceLikeCrazy();
  }
  public static void main(String[] args) {
    new Test().go();
  }
}
