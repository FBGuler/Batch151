package day38enumsiterators;

public class EnumRunner {

    public static void main(String[] args) {

        String capitalOfIllinois = UsStatesEnum.ILLINOIS.getCapital();
        System.out.println(capitalOfIllinois);  //Springfield

        String abbreviationOfFlorida = UsStatesEnum.FLORIDA.getAbbreviation();
        System.out.println(abbreviationOfFlorida);

        UsStatesEnum state = UsStatesEnum.ALASKA;
        System.out.println(state);

        String stateName = UsStatesEnum.getStateNameByUsingAbbreviation("AK");
        System.out.println(stateName); //Alaska

        String abbreviationName = UsStatesEnum.getAbbreviationForStateName("Alaska");
        System.out.println(abbreviationName);//AK













    }





}
