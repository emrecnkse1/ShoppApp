package com.example.shoppapp.Activity.Activity;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.shoppapp.Activity.Adapter.PopularListAdapter;
import com.example.shoppapp.Activity.Domain.PopularDomain;
import com.example.shoppapp.R;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapterPopular;
    private RecyclerView recyclerViewPopular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void initRecyclerView() {
        ArrayList<PopularDomain> items = new ArrayList<>();
        items.add(new PopularDomain("ASUS Vivobook 15", "Yenilikçi tasarımı ve yüksek performansı ile dikkat çeken Asus Vivobook 15, günlük işleriniz ve eğlenceleriniz için ideal bir çözüm sunar. 11. Nesil Intel Core i5 işlemcisi, hızlı veri işleme ve çoklu görevlerde üstün performans sağlar. Geniş 15.6 inç ekranı, canlı renkler ve keskin detaylar sunarak her görseli etkileyici kılar.", "pic1", 15, 4, 26500));
        items.add(new PopularDomain("İphone 14 Pro Max", "En yeni A16 Bionic çip ile üstün hız ve performans, 6.7 inç Super Retina XDR ekran ile çarpıcı görseller. Gelişmiş kamera sistemi, uzun pil ömrü ve dayanıklı tasarımıyla iPhone 14 Pro Max, en yüksek beklentilerinizi bile karşılar.", "pic3", 25, 4.5, 82500));
        items.add(new PopularDomain("Sony Playstation 5", "En yeni AMD Ryzen Zen 2 işlemci ile üstün hız ve performans, 4K oyun deneyimi sunan çarpıcı görseller. Gelişmiş DualSense kablosuz kontrol cihazı ile gerçekçi dokunsal geri bildirim, hızlı yükleme süreleri ve geniş oyun kütüphanesiyle PlayStation 5, en yüksek beklentilerinizi bile karşılar.", "pic2", 15, 4.3, 26500));

        recyclerViewPopular = findViewById(R.id.recyclerView1);
        recyclerViewPopular.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        adapterPopular = new PopularListAdapter(items);
        recyclerViewPopular.setAdapter(adapterPopular);
    }
}
