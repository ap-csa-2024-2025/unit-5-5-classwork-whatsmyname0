public class Oven
{
    private int maxTemp;
    private int currentTemp;

    public void setMaxTemp(int Temp)
    {
        if ((Temp > 500) || (Temp < 0))
        {
            maxTemp = 500;
        }
        else 
        {
            maxTemp - Temp;
        }
    }

    public int getMaxTemp()
    {
        return maxTemp;
    }

    public int getCurrentTemp()
    {
        return currentTemp;
    }

    public void turnOff()
    {
        if (currentTemp != 0)
        {
            currentTemp = 0;
        }
    }

    public boolean isOn()
    {
        if (currentTemp > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void preheat(int Temp)
    {
        if (Temp > maxTemp)
        {
            currentTemp = maxTemp;
        }
        else
        {
            currentTemp = Temp;
        }
    }

    public String toString()
    {
        return ("New oven with a maximum temperature of " + maxTemp + " and a starting temperature of " + currentTemp);
    }
}


