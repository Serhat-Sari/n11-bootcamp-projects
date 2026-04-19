public void etkinlik(int sicaklik) {
    if (sicaklik < 5) {
        System.out.println("Kayak yapabilirsin.");
        return; // Metodu burada bitir, aşağıya bakma
    }
    
    if (sicaklik <= 15) {
        System.out.println("Sinemaya gidebilirsin.");
        return;
    }
    
    if (sicaklik <= 25) {
        System.out.println("Piknik yapabilirsin.");
        return;
    }
    
    // Hiçbiri değilse geriye tek seçenek kalıyor
    System.out.println("Yüzmeye gidebilirsin.");
}