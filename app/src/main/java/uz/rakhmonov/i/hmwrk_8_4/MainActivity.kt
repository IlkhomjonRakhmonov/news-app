package uz.rakhmonov.i.hmwrk_8_4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.rakhmonov.i.hmwrk_8_4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.text1.setOnClickListener{
            val intent=Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://kun.uz/news/2022/11/14/zelenskiy-xerson-tashlab-ketilgan-minalar-tufayli-xavfliligicha-qolmoqda"))
            startActivity(intent)}

        binding.text2.setOnClickListener{
            val intent2=Intent(Intent.ACTION_VIEW)
            intent2.setData(Uri.parse("https://kun.uz/news/2022/11/13/ozbekistonda-blekaut-xavfi-yuzaga-keldi"))
            startActivity(intent2)
        }
        binding.text3.setOnClickListener{
            val intent3=Intent(Intent.ACTION_VIEW)
            intent3.setData(Uri.parse("https://kun.uz/news/2022/11/14/yaponiya-ozbekistonda-litiy-batareyalarini-ishlab-chiqarish-masalasini-organyapti"))
            startActivity(intent3)}

    binding.text4.setOnClickListener{
            val intent4=Intent(Intent.ACTION_VIEW)
            intent4.setData(Uri.parse("https://kun.uz/news/2022/11/11/samarqandda-turkiy-davlatlar-tashkiloti-sammiti-boshlanmoqda"))
            startActivity(intent4)}
     binding.text5.setOnClickListener{
            val intent5=Intent(Intent.ACTION_VIEW)
            intent5.setData(Uri.parse("https://kun.uz/news/2022/11/13/istanbul-markazida-portlash-sodir-boldi-qurbonlar-bor"))
            startActivity(intent5)}

        binding.btnSearch.setOnClickListener{
            val intent6=Intent(Intent.ACTION_VIEW)
            intent6.setData(Uri.parse("https://kun.uz/"))
            startActivity(intent6)}
        binding.btnKun.setOnClickListener{
            val intent7=Intent(Intent.ACTION_VIEW)
            intent7.setData(Uri.parse("https://kun.uz/"))
            startActivity(intent7)}
        binding.btnMenu.setOnClickListener{
            val intent8=Intent(Intent.ACTION_VIEW)
            intent8.setData(Uri.parse("https://kun.uz/news/list"))
            startActivity(intent8)}
    }
}