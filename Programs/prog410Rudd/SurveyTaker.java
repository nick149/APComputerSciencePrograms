/**
 * Program: Survey for prog410tRudd
 * @Version: 1.0
 * @Author: Nicholas Rudd
 * Compiler/Platform: Java 1.7/ Windows 7
 * Desciption:See prog410tRudd
 */
public class SurveyTaker
{
  final int MAX = 30;
  private int idx = 0;
  private int sumOfIncome = 0;
  private String[] surveyIds = new String[MAX];
  private int[] incomes = new int[MAX];
  private int[] members = new int[MAX];

  public void setSurvey(String value) {
    if (idx < MAX) {
      String[] fields = value.split(" ");
      surveyIds[idx] = fields[0];
      incomes[idx] = Integer.parseInt(fields[1]);
      members[idx] = Integer.parseInt(fields[2]);
      sumOfIncome += incomes[idx];
      idx++;
    }
  }

  public int getNumberOfHousehold() {
    return this.idx;
  }

  public double getAverageIncome() {
    return (double) sumOfIncome / getNumberOfHousehold();
  }

  public int getIncomeByIdx(int idx) {
    return incomes[idx];
  }

  public String formattedString(int idx) {
    String style = "%s %d %d";
    return String.format(style, this.surveyIds[idx], this.incomes[idx], this.members[idx]);
  }

  public boolean isInPoverty(int idx) {
    boolean result = false;
    int threadhold = (3750 + 750 * members[idx]);
    result = incomes[idx] <= threadhold;
    return result;
  }

}
