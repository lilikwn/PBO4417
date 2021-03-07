public class TestTV {
    public static void main(String[] args) {
        TV tvKu1 = new TV();
        tvKu1.turnOn();
        tvKu1.setChannel(30);
        tvKu1.setVolume(3);

        System.out.println("tvKu1's channel is " + tvKu1.channel + " and volume level is " + tvKu1.volumeLevel);
    }
}

class TV {
    int channel = 7;
    int volumeLevel = 1;
    Boolean on = false;

    TV() {

    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on == true) {
            if (newChannel <= 120 && newChannel >= 1) {
                channel = newChannel;
            } else {
                System.out.println("Sorry channel not found");
            }
        }

    }

    public void setVolume(int newVolumeLevel) {
        if (on == true) {
            if (newVolumeLevel <= 7 && newVolumeLevel >= 0) {
                volumeLevel = newVolumeLevel;
            } else {
                System.out.println("Sorry invalid input for volume level, please input in range 1 - 7");
            }
        }

    }

    public void channelUp() {
        if (channel == 120) {
            channel = 1;
        } else {
            channel++;
        }
    }

    public void channelDown() {
        if (on == true) {
            if (channel == 1) {
                channel = 120;
            } else {
                channel--;
            }
        }
    }

    public void volumeUp() {
        if (on == true) {
            if (volumeLevel == 7) {
                System.out.println("volume is at the maximum level");
            } else {
                volumeLevel++;
            }
        }
    }

    public void volumeDown() {
        if (on == true) {
            if (volumeLevel == 0) {
                System.out.println("volume is at the mminimumlevel");
            } else {
                volumeLevel--;
            }
        }
    }

}