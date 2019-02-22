
package class4.pkg2;

import java.util.Scanner;

public class Class42 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        String teamName = "";
        
        System.out.println("Enter your favorite NFC North team");
        String teamInput = keyboard.nextLine();
        teamInput = teamInput.toUpperCase().substring(0, 3);
        
        for (Teams t : Teams.values()) {
            if (teamInput.equals(t.getAbbreviation1())) {
                teamName = t.getTeamName();
                break;
            }
            else if (teamInput.equals(t.getAbbreviation2())) {
                teamName = t.getTeamName();
                break;
            }
        }
        System.out.println(teamName);
    }
    
    public enum Teams {
        PACKERS ("GRE", "PAC", "Green Bay Packers"),
        BEARS ("CHI", "BEA", "Chicago Bears"),
        LIONS ("DET", "LIO", "Detroit Lions"),
        VIKINGS ("MIN", "VIK", "Minnesota Vikings");

        private String abbreviation1, abbreviation2, teamName;

        private Teams(String abbreviation1, String abbreviation2, String teamName) {
            this.abbreviation1 = abbreviation1;
            this.abbreviation2 = abbreviation2;
            this.teamName = teamName;
        }

        public String getTeamName() {     
            return teamName;
        }

        public String getAbbreviation1() {
            return abbreviation1;
        }

        public String getAbbreviation2() {
            return abbreviation2;
        }
    }    
}
