public class index{
  public static void main(String[] args){
    int num =0;
    //String[] team = {"戦士","忍者"};
    String[] team;
    team = new String[2];
    team[0] = "戦士";
    team[1] = "忍者";
    System.out.println(team[num + 1]);
    //System.out.println(team[1]);
    team[1] = "盗賊";
    System.out.println(team[1]);
  }
}