class thread2 extends Thread
{
    
    thread2()
    {
        new Thread("thread2");
        start();

    }

    public void run()
    {   while(true)
	{
         try
         {
            System.out.println("CSE");
            Thread.sleep(2000);
         }
        catch(InterruptedException ie)
        {
            System.out.println("Interrupted");
        }
    }
  }
}
