class SportsRunner{

public static void main(String[] play)
{
	System.out.println("cricketTeamMembers");
		String[] cricketTeamMembers={"Rohit Sharma", "KL Rahul", "Ruturaj Gaikwad", "Shikhar Dhawan", "Shreyas Iyer", "Airbus A321", "Airbus 319", "Shubman Gill", "Suryakumar Yadav", "Virat Kohli", "Mohammed Shami"};
		Sports.cricketTeamMembers(cricketTeamMembers);
		
	System.out.println("kabbadiTeamMembersJerseyNos");
		int[] JerseyNos={21, 18, 14, 48, 32, 77, 99, 110, 55, 43, 11};
		Sports.kabbadiTeamMembersJerseyNos(JerseyNos);
		
	System.out.println("FootBallTeamMembersSalary");
		double[] Salary={700000, 1000000, 1400000, 700000, 600000, 770000, 990000, 110000, 550000, 430000, 110000};
		Sports.FootBallTeamMembersSalary(Salary);
		
	System.out.println("ludoTeamMobileNumber");
		long[] MobileNo={9481668521L, 78655487321L, 8904189445L, 9110819083L, 8035370626L, 8861539422L, 9482240751L, 8884298333L, 9113890538L, 9448722000L, 8066263906L};
		Sports.ludoTeamMobileNumber(MobileNo);
		
	System.out.println("hockeyTeamMembersNoOfMatches");
		int[] NoOfMatches={9, 7, 8, 9, 7, 6, 3, 4 ,9, 1,8};
		Sports.hockeyTeamMembersNoOfMatches(NoOfMatches);
		
	System.out.println("kokoTeamMembersCountryCode");
		long[] CountryCode={91, 840, 826, 784, 004,  586, 554 ,156, 170,180};
		Sports.kokoTeamMembersCountryCode(CountryCode);
		
	System.out.println("lagoriTeamMembersAlive");
		boolean[] Alive={true, false, true, false, true, true, false, false ,false, true,true};
		Sports.lagoriTeamMembersAlive(Alive);
}

}