public class LiDynasty {
    int warriorAttackLi = 13;
    int archerAttackLi = 24;
    int riderAttackLi = 46;
    int numberOfWarriorsLi = 860;
    public void powerLi(){
        int countLi = (warriorAttackLi+archerAttackLi+riderAttackLi)*numberOfWarriorsLi;
        System.out.println("Общий показатель атаки династии Ли - " + countLi);
    }

}

