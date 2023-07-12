package seminar_2.Classes;

public abstract class ItemFabric {

    public void openReward()
    {
        iGameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract iGameItem createItem();
}
