package lab.phb.datamahasiswa.controller;

import lab.phb.datamahasiswa.entity.DataMahasiswa;
import lab.phb.datamahasiswa.model.DataMahasiswaModel;
import lab.phb.datamahasiswa.services.DataMahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Optional;

@Controller
public class WebController {

    @Autowired
    private DataMahasiswaService service;

    @GetMapping("/")
    public String getIndex(Model model){
        model.addAttribute("data", service.getAllData());
        return "index";
    }

    @GetMapping("/tambah")
    public String tampilkanFormTambah(Model model){
        model.addAttribute("data", new DataMahasiswaModel());
        return "tambah-data";
    }

    @PostMapping("/simpan")
    public String simpan(DataMahasiswaModel data){
        service.save(service.convertToEntity(data));
        return "redirect:/";
    }

    @GetMapping("/ubah/{nim}")
    public String ubah(@PathVariable("nim") String nim, Model model) {
        Optional<DataMahasiswa> result = service.findById(nim);
        if(result.isPresent()) {
            DataMahasiswa data1 = result.get();
            model.addAttribute("data", data1);
            return "edit-data";
        } else {
            return "redirect:/";
        }
    }

    @GetMapping("/hapus/{nim}")
    public String hapus(@PathVariable("nim") String nim) {
        service.removeById(nim);
        return "redirect:/";
    }

}
