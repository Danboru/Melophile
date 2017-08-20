package com.vpaliy.data.mapper;

import com.vpaliy.data.Config;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("WeakerAccess")
public class MapperUtils {

    public static List<String> splitString(String string){
        if(string==null||string.isEmpty()) return null;
        string=string.replace(" ",",");
        return Arrays.asList(string.split("\\s*,\\s*"));
    }

    public static String toString(List<String> strings){
        if(strings==null) return null;
        return  strings.toString().replaceAll("[\\[.\\].\\s+]", "");
    }

    public static int convertToInt(String number){
        if(number==null) return 0;
        return Integer.parseInt(number);
    }

    public static String convertToStream(String streamUrl){
        if(streamUrl==null) return null;
        return streamUrl+"?client_id="+ Config.CLIENT_ID;
    }
}
