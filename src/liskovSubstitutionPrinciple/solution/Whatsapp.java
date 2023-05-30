package liskovSubstitutionPrinciple.solution;

public class Whatsapp implements SocialMedia, SocialVideoCallManager {
    public void chatWithFriend() {
        //supported
    }

    public void sendPhotosAndVideos() {
        //supported
    }

    public void groupVideoCall(String users) {
        //supported
    }
}
