package com.company.doandlearn.classes.classandobject.task6;

import java.util.function.Consumer;
import java.util.function.Function;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void setHour(int hour) {
        if (hour >= 0 && hour <= 24) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute <= 60) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
    }

    public void setSecond(int second) {
        if (second >= 0 && second <= 60) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    @Override
    public String toString() {
        return String.format("%02d : %02d : %02d", hour, minute, second);
    }

    public void changeHour(int hour) {
        if(hour>=0) {
            this.hour = (this.hour+hour)%24;
        } else if(this.hour - hour>24) {
            this.hour = 24 - (Math.abs((this.hour+hour)%24));
        } else {
            this.hour +=hour;
        }

    }

    public void changeMinutes(Integer minute) {
        if (minute == 0) {
            return;
        }
        if (this.minute - minute > 60) {
            int buffHour = (this.minute - minute) / 60;
            this.minute = 60 - (Math.abs((this.minute + minute) % 60));
            changeHour(-buffHour);
        } else if (minute > 0) {
            int buffHour = (this.minute + minute) / 60;
            this.minute = (this.minute + minute) % 60;
            changeHour(buffHour);
        } else {
            this.minute += minute;
        }
    }

    public void changeSeconds(int second) {
        if (second == 0) {
            return;
        }
        if (second > 0) {
            int buffMinute = (this.second + second) / 60;
            this.second = (this.second + second) % 60;
            changeMinutes(buffMinute);
        } else if (this.second - second > 60) {
            int buffMinute = (this.second - second) / 60;
            this.second = 60 - (Math.abs((this.second + second) % 60));
            changeMinutes(-buffMinute);
        } else {
            this.second += second;
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////
    private int changeMultiple60(int initionalValue, int value, boolean isForSeconds) {
        if (value == 0) {
            return initionalValue;
        }
        if (value > 0) {
            int buff = (initionalValue + value) / 60;
            initionalValue = (initionalValue + value) % 60;
            correctValue(buff, isForSeconds);
        } else if (initionalValue - value > 60) {
            int buff = (initionalValue - value) / 60;
            initionalValue = 60 - (Math.abs((initionalValue + value) % 60));
            correctValue(-buff, isForSeconds);
        } else {
            initionalValue += value;
        }
        return initionalValue;
    }

    public void changeSecondsV2(int second) {
        this.second = changeMultiple60(this.second, second, true);
    }

    public void changeMinutesV2(int minute) {
        this.minute = changeMultiple60(this.minute, minute, false);
    }

    private void correctValue(int value, boolean isForSecond) {
        if (isForSecond) {
            changeMinutes(value);
        } else {
            changeHour(value);
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////
    private int changeMultiple60(int initionalValue, int value, Consumer<Integer> correctFunction) {
        if (value == 0) {
            return initionalValue;
        }
        if (initionalValue - value > 60) {
            int buff = (initionalValue - value) / 60;
            initionalValue = 60 - (Math.abs((initionalValue + value) % 60));
            correctFunction.accept(-buff);
        } else if (value > 0) {
            int buff = (initionalValue + value) / 60;
            initionalValue = (initionalValue + value) % 60;
            correctFunction.accept(buff);
        } else {
            initionalValue += value;
        }
        return initionalValue;
    }

    public void changeSecondsV3(int second) {
        this.second = changeMultiple60(this.second, second, this::changeMinutes);
    }

    public void changeMinutesV3(int minute) {
        this.minute = changeMultiple60(this.minute, minute, this::changeHour);
    }
    //https://stackoverflow.com/questions/29945627/java-8-lambda-void-argument

    //https://techndeck.com/how-to-pass-function-as-a-parameter-in-a-method-in-java-8/

}

