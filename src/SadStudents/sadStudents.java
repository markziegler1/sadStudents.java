package SadStudents;

public class sadStudents {

  private String name;
  private int levelOfEngagement;
  private int expectedExamGrade;
  sadStudents(int l, int e) {
  levelOfEngagement = l;
  expectedExamGrade = e;
}
  void setName (String name){
    this.name = name;
  }
  void setLevelOfEngagement (int levelOfEngagement) {
    this.levelOfEngagement = levelOfEngagement;
  }
  void setExpectedExamGrade (int expectedExamGrade) {
    this.expectedExamGrade = expectedExamGrade;
  }
  String getName () {
    return name;
  }
  int getLevelOfEngagement () {
    return levelOfEngagement;
  }
  int getExpectedExamGrade () {
    return expectedExamGrade;
  }

  void danceLikeCrazy () {
    getLevelOfEngagement();
    getExpectedExamGrade();
    setExpectedExamGrade(expectedExamGrade + 1);
    setLevelOfEngagement(levelOfEngagement + 10);
  }
  void shoutLikeCrazy (){
    getLevelOfEngagement();
    getExpectedExamGrade();
    setExpectedExamGrade(expectedExamGrade + 1);
    setLevelOfEngagement(levelOfEngagement + 10);
  }
  void lookLikeAZombie () {
  getLevelOfEngagement();
  getExpectedExamGrade();
    setExpectedExamGrade(expectedExamGrade - 1);
    setLevelOfEngagement(levelOfEngagement - 10);
  }
  void ignoreTeachersInspirationalMoves() {
    getLevelOfEngagement();
    getExpectedExamGrade();
    setExpectedExamGrade(expectedExamGrade - 1);
    setLevelOfEngagement(levelOfEngagement - 10);
  }
}
