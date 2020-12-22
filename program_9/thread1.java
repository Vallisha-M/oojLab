class thread1 extends Thread
{
    
    thread1()
    {
        new Thread("thread1");
        start();
    }

    public void run()
    {  
	 while(true)
	{
         try
         {
            System.out.println("BMS College Of Engineering");
            Thread.sleep(10000);
         }
        catch(InterruptedException ie)
        {
            System.out.println("Interrupted");
        }
    }
  }
}
