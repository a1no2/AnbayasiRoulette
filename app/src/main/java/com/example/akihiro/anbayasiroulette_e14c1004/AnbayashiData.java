package com.example.akihiro.anbayasiroulette_e14c1004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Created by akihiro on 2016/11/02.
 */
public class AnbayashiData{
    public final int number;
    public final int addition;
    public final String comment;


    public AnbayashiData(int number, int addition, String comment){
        this.number=number;
        this.addition=addition;
        this.comment=comment;


    }
    enum AnbayashiDataType{

        MIDDLE("まあまあ", 8), SHAME("残念！", 5), LUCKY("あたり", 10), VERY_LUCKY("大当たり", 14);

        public final String comment;
        public  final int number;
        AnbayashiDataType(String comment,int number){
            this.comment=comment;
            this.number=number;

        }


    }
    public static List<AnbayashiData> createAnbayashiDataList(){
        Random random = new Random();
        List<AnbayashiData> list = new ArrayList<>();
        for (int i = 0;i<=30;i++) {
            AnbayashiDataType[] typeValues = AnbayashiDataType.values();
            List<AnbayashiDataType> typeList = Arrays.asList(typeValues);

            int typeSize = typeList.size();
            int typeRandomIndex = random.nextInt(typeSize);
            AnbayashiDataType type = typeList.get(typeRandomIndex);
            int numberAddition = random.nextInt(3) - 1;
            int addition = random.nextInt(5);
            list.add(new AnbayashiData(type.number + numberAddition, addition, type.comment));
        }
        return list;
    }


}
