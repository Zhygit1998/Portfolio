public class MingDynasty {
    int warriorAttackMing = 9;
    int archerAttackMing = 35;
    int riderAttackMing = 12;
    public void powerMing(){
        LiDynasty liDynasty = new LiDynasty();
        int numberOfWarriorsMing = (int) (liDynasty.numberOfWarriorsLi*1.5);
        int countMing = (warriorAttackMing+archerAttackMing+riderAttackMing)*numberOfWarriorsMing;
        System.out.println("Общий показатель атаки династии Минь - " + countMing);
    }
}
