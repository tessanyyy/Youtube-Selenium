Feature: SearchData

  Scenario: TCC.YTB.001 Membuka web youtube
    When TCC.YTB.001 Mengakses URL
    Then TCC.YTB.001 Berhasil mengakses URL

  Scenario: TCC.YTB.002 Search data valid
    When TCC.YTB.002 Klik Search menu
    And TCC.YTB.002 Input Search
    And TCC.YTB.002 Klik tombol enter
    Then TCC.YTB.002 Tampil hasil pencarian