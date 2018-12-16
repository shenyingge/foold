package com.example.foold;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class JieguoActivity extends Activity {
    private TextView qi3Tv;

    protected void onCreate(Bundle saveInstance) {
        super.onCreate(saveInstance);
        setContentView(R.layout.jieguo);
        qi3Tv=(TextView)findViewById(R.id.qi3);

                Intent intent=getIntent();
                int id =intent.getIntExtra("xvhao",0);


                if(id==1){
                    //第一道拔丝地瓜
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E6%8B%94%E4%B8%9D%E5%9C%B0%E7%93%9C/2521970?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==2){
                    //第二道白菜炖豆腐
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E7%99%BD%E8%8F%9C%E7%82%96%E8%B1%86%E8%85%90/2569033?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==3){
                    //第三道剁椒鱼头
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E5%89%81%E6%A4%92%E9%B1%BC%E5%A4%B4/1171373?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==4){
                    //宫保虾球
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E5%AE%AB%E4%BF%9D%E8%99%BE%E7%90%83/7689923?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==5){
                    //京酱肉丝
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E4%BA%AC%E9%85%B1%E8%82%89%E4%B8%9D/781377?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==6){
                    //老醋花生
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E8%80%81%E9%86%8B%E8%8A%B1%E7%94%9F/5798684?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==7){
                    //凉拌木耳
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E5%87%89%E6%8B%8C%E6%9C%A8%E8%80%B3/3354009?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==8){
                    //麻辣豆腐
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E5%AE%B6%E5%B8%B8%E9%BA%BB%E8%BE%A3%E8%B1%86%E8%85%90/10789342");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==9){
                    //蚂蚁上树
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E8%9A%82%E8%9A%81%E4%B8%8A%E6%A0%91/5192?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==10){
                    //毛血旺
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E6%8B%94%E4%B8%9D%E5%9C%B0%E7%93%9C/2521970?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==11){
                    //奶黄包
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E5%A5%B6%E9%BB%84%E5%8C%85/10333644?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==12){
                    //皮蛋瘦肉粥
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E7%9A%AE%E8%9B%8B%E7%98%A6%E8%82%89%E7%B2%A5/225313?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==13){
                    //啤酒鸭
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E5%95%A4%E9%85%92%E9%B8%AD/2843654?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==14){
                    //清蒸鲈鱼
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E6%B8%85%E8%92%B8%E9%B2%88%E9%B1%BC/2693980?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==15){
                    //手撕包菜
                    Uri uri = Uri.parse("https://baike.baidu.com/item/手撕包菜/3850301?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==16){
                    //水煮肉片
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E6%B0%B4%E7%85%AE%E8%82%89%E7%89%87/173346?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==17){
                    //水煮鱼
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E6%B0%B4%E7%85%AE%E9%B1%BC/30972?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==18){
                    //酸辣白菜
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E9%85%B8%E8%BE%A3%E7%99%BD%E8%8F%9C/2243571?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==19){
                    //酸梅汤
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E9%85%B8%E6%A2%85%E6%B1%A4/947558?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==20){
                    //糖醋排骨
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E7%B3%96%E9%86%8B%E6%8E%92%E9%AA%A8/31447?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==21){
                    //西湖牛肉羹
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E8%A5%BF%E6%B9%96%E7%89%9B%E8%82%89%E7%BE%B9/2957370?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==22){
                    //香辣烤鱼
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E9%A6%99%E8%BE%A3%E7%83%A4%E9%B1%BC/7664717?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==23){
                    //小鸡炖蘑菇
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E5%B0%8F%E9%B8%A1%E7%82%96%E8%98%91%E8%8F%87/1414790?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==24){
                    //鱼香茄子
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E9%B1%BC%E9%A6%99%E8%8C%84%E5%AD%90/593560?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }else if(id==25){
                    //鱼香肉丝
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E9%B1%BC%E9%A6%99%E8%82%89%E4%B8%9D/125511?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }
                else{
                    Uri uri = Uri.parse("https://baike.baidu.com/item/%E6%8B%94%E4%B8%9D%E5%9C%B0%E7%93%9C/2521970?fr=aladdin");
                    Intent intent1 = new Intent(Intent.ACTION_VIEW,uri);
                    startActivity(intent1);
                }


    }
}
