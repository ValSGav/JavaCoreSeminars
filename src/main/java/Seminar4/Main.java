package Seminar4;

public class Main {
    public static void main(String[] args) {
        try {
            boolean itSOk = CheckTheIdentificationData.CheckLoginPassword("BanVanBanVanBanBanG", "Luziasdfadsfadsfasdfasdfasfed", "Luzi");
        } catch (WrongPasswordException e) {
            e.printStackTrace();
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        }

    }
}
