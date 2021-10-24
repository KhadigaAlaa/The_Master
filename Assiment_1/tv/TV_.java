package tv;
public class TV_ 
{
    private int channel;
    private int volume;
    private boolean on;
    
    public TV_()
    {
           channel=0;
           volume=0;
           on=false;
    }
    public void turnOn()
    { 
        on=true;
    }  
    public void turnOff()
    { 
        on=false;
    } 
   public void  setChannel(int newChannel)
    {
        if(newChannel>0 && newChannel<121 && on)
            channel=newChannel;
    }
     
   public void  setVolume(int newVolumeLevel)
    {
        if(newVolumeLevel>0 && newVolumeLevel<8 && on)
            channel=newVolumeLevel;
    }
    public void  channelUp()
    {
        if(channel>0 && channel<121 && on)
            channel++;
    }
    public void  channelDown()
    {
        if(channel>0 && channel<121 && on)
            channel--;
    }
    public void  volumeUp()
    {
        if(volume>0 && volume<8 && on)
            volume++;
    }
    public void  volumeDown()
    {
        if(volume>0 && volume<8 && on)
            volume--;
    }
    public int  getChannel()
     {
         return channel;
     }
    public int  getVolume()
     {
         return volume;
     }
}
