package api;

import org.testng.annotations.Test;
import org.testng.Assert;

public class apiTest {
    @Test
    public void testPositiveCase() {
        // Membuat permintaan API dengan input yang benar
        // Validasi kode status respons harus 200 (OK)
        // Validasi payload respons sesuai dengan yang diharapkan
    }

    @Test
    public void testNegativeCase() {
        // Membuat permintaan API dengan input yang salah
        // Validasi kode status respons sesuai dengan yang diharapkan (misal: 4xx)
        // Validasi pesan kesalahan dalam respons
    }

    @Test
    public void testEdgeCase() {
        // Membuat permintaan API dengan nilai maksimum atau minimum untuk parameter masukan
        // Validasi kode status respons dan payload sesuai dengan yang diharapkan
    }
}
