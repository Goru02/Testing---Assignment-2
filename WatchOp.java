public class WatchOp {
    public static String watchfunc(String in, Watch watch) {
        String string = in;
        char input = string.charAt(0);
        int index = 0;
        while (index < string.length()) {
            if (input == 'a' || input == 'b' || input == 'c' || input == 'd') {
                if (watch.getState().equals("normal")) {
                    if (watch.getInnerState().equals("Time")) {
                        if (input == 'a') {
                            watch.setInnerState("Date");
                        } else if (input == 'b') {
                            watch.setState("Alarm");
                            watch.setInnerState("Alarm");
                        } else if (input == 'c') {
                            watch.setState("Update");
                            watch.setInnerState("min");
                        }
                    } else if (watch.getInnerState().equals("Date")) {
                        if (input == 'a') {
                            watch.setInnerState("Time");
                        } else if (input == 'b') {
                            watch.setState("Alarm");
                            watch.setInnerState("Alarm");
                        } else if (input == 'c') {
                            watch.setState("Update");
                            watch.setInnerState("min");
                        }
                    }
                } else if (watch.getState().equals("Alarm")) {
                    if (input == 'a') {
                        watch.setInnerState("Chime");
                    }
                } else if (watch.getState().equals("Update")) {
                    if (watch.getInnerState().equals("min")) {
                        if (input == 'a') {
                            watch.setInnerState("hour");
                        } else if (input == 'b') {
                            if (watch.getMinute() < 60) {
                                int m = watch.getMinute();
                                watch.getMinute(++m);
                            } else watch.getMinute(0);
                        }
                    } else if (watch.getInnerState().equals("hour")) {
                        if (input == 'a') {
                            watch.setInnerState("day");
                        } else if (input == 'b') {
                            if (watch.getHour() < 24) {
                                int h = watch.getHour();
                                watch.setHour(++h);
                            } else watch.setHour(0);
                        }
                    } else if (watch.getInnerState().equals("day")) {
                        if (input == 'a') {
                            watch.setInnerState("month");
                        } else if (input == 'b') {
                            if (watch.getDay() < 31) {
                                int d = watch.getDay();
                                watch.setDay(++d);
                            } else watch.setDay(0);
                        }
                    } else if (watch.getInnerState().equals("month")) {
                        if (input == 'a') {
                            watch.setInnerState("year");
                        } else if (input == 'b') {
                            int m = watch.getMonth();
                            watch.setMonth(++m);
                        }
                    } else if (watch.getInnerState().equals("year")) {
                        if (input == 'a') {
                            watch.setState("normal");
                            watch.setInnerState("Time");
                        } else if (input == 'b') {
                            int y = watch.getYear();
                            watch.setYear(++y);
                        }
                    }
                }
            } else {
                watch.setState("Error");
                break;
            }
            input = string.charAt(index++);
        }
        if (!watch.getState().equals("Error")) {
            String y = Integer.toString(watch.getYear());
            String m = Integer.toString(watch.getMonth());
            String d = Integer.toString(watch.getDay());
            return y + '-' + m + '-' + d;
        }else return "Error wrong input. input can only be (a,b,c,d)";

    }
}
