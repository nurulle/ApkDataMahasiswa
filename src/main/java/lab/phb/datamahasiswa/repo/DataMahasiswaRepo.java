package lab.phb.datamahasiswa.repo;

import lab.phb.datamahasiswa.entity.DataMahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataMahasiswaRepo extends JpaRepository<DataMahasiswa, String> {
}
