package proxy;


public class UserDataApplication {
    public static void main(String[] args) {
        UserDataServiceImpl userDataService = new UserDataServiceImpl();
        UserData userData1 = userDataService.getUserData(1);
        UserData userData2 = userDataService.getUserData(2);

        UserDataServiceCacheImpl userDataServiceCache = new UserDataServiceCacheImpl();
        UserData cacheUser1 = userDataServiceCache.getUserData(3);
        UserData cacheUser2 = userDataServiceCache.getUserData(4);
        UserData cacheUser3 = userDataServiceCache.getUserData(4);

        System.out.println(userData1);
        System.out.println(userData2);
        System.out.println(cacheUser1);
        System.out.println(cacheUser2);
        System.out.println(cacheUser3);
    }
}
