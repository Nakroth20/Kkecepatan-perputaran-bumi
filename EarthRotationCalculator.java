/**
 * Kelas EarthRotationCalculator digunakan untuk menghitung kecepatan perputaran bumi
 * pada sekitar sumbunya.
 */
public class EarthRotationCalculator {
    /**
     * Menghitung kecepatan perputaran bumi pada sekitar sumbunya.
     *
     * @param equatorRadius Jari-jari bumi di garis khatulistiwa (dalam kilometer).
     * @return Kecepatan perputaran bumi (dalam kilometer per jam).
     */
    public double calculateEarthRotationSpeed(double equatorRadius) {
        // Kecepatan perputaran bumi dihitung sebagai keliling bumi dibagi waktu satu hari.
        // Keliling bumi ≈ 2 * π * jari-jari bumi
        // Waktu satu hari ≈ 24 jam
        double earthCircumference = 2 * Math.PI * equatorRadius;
        double rotationSpeed = earthCircumference / 24.0;

        return rotationSpeed;
    }

    /**
     * Metode main untuk menjalankan aplikasi.
     *
     * @param args Argumen baris perintah (tidak digunakan dalam contoh ini).
     */
    public static void main(String[] args) {
        EarthRotationCalculator calculator = new EarthRotationCalculator();

        // Jari-jari bumi di garis khatulistiwa dalam kilometer
        double equatorRadius = 6371.0; // Sekitar 6371 kilometer.

        // Menghitung kecepatan perputaran bumi pada sekitar sumbunya.
        double rotationSpeed = calculator.calculateEarthRotationSpeed(equatorRadius);

        System.out.println("Kecepatan perputaran bumi pada sekitar sumbunya di garis khatulistiwa adalah: " + rotationSpeed + " kilometer per jam.");
    }
}
