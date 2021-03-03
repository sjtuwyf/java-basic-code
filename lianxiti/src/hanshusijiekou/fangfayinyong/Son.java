package hanshusijiekou.fangfayinyong;

public class Son extends Father {
    @Override
    public void askMoney() {
        System.out.println("askmoney s");
    }

    @Override
    public void spendMoney() {
        System.out.println("spendmoney s");
    }

    public void helpFather(Helper helper) {
        helper.help();
    }

    public void daJiangyou() {
        helpFather(super::askMoney);
        helpFather(super::spendMoney);
    }
}
