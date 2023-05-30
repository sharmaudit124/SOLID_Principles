package liskovSubstitutionPrinciple;

/*In simpler terms,
LSP means that if you have a base class and a derived class,
you should be able to use objects of the derived class wherever objects of the base class are expected,
without causing any unexpected behavior or breaking the code.

For example, let's say we have a base class called Shape with a method called calculateArea().
According to LSP, any derived class, such as Rectangle or Circle,
should be able to replace the Shape class and provide its own implementation of calculateArea() without breaking the code that relies on the Shape class.
The code using Shape should still work correctly and produce valid results when working with objects of Rectangle or Circle,
without needing to know the specific derived class.

*/
public abstract class SocialMedia {

    //@support WhatsApp,Facebook,Instagram
    public abstract void chatWithFriend();

    //@support Facebook,Instagram
    public abstract void publishPost(Object post);

    //@support WhatsApp,Facebook,Instagram
    public abstract void sendPhotosAndVideos();

    //@support WhatsApp,Facebook
    public abstract void groupVideoCall(String users);
}
