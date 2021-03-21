package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BillettController {
    private final List<Billett> Billettene=new ArrayList<>();

    @PostMapping("/kunde")
    public void returBillett(Billett innBillett){
        Billettene.add(innBillett);
    }

    @GetMapping("/hentBilletter")
    public List<Billett> hentBillett() {
        return Billettene;
    }

    @GetMapping("/slettBilletter")
    public void slettBilletter() {
        Billettene.clear();
    }
}
