<?php
require_once 'AnggotaDPR.php';

// Membuat array dari objek AnggotaDPR
$listAnggotaDPR = [
    new AnggotaDPR("1A", "Agus", "Regional", "Bulan Sabit"),
    new AnggotaDPR("1B", "Budi", "Nasional", "Kuda Hitam"),
    new AnggotaDPR("2A", "Susi", "Kota", "Kertajasa"),
    new AnggotaDPR("2B", "Siti", "Kecamatan", "Potramin")
];
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
        table {
            width: 100%;
            margin-top: 20px;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #00ffff;
            text-align: center;
        }

        img {
            max-width: 100px;
            max-height: 100px;
        }
    </style>
    <title>List Anggota DPR</title>
</head>

<body>

    <h2>List Anggota DPR</h2>
    <br>
    <p>Create & Read</p>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Bidang</th>
            <th>Partai</th>
            <th>Foto</th>
        </tr>

        <?php foreach ($listAnggotaDPR as $anggota) { ?>
            <tr>
                <td><?= $anggota->getId() ?></td>
                <td><?= $anggota->getName() ?></td>
                <td><?= $anggota->getBidang() ?></td>
                <td><?= $anggota->getPartai() ?></td>
                <td><img src='<?= "https://tr.rbxcdn.com/54148d6eef670226565d3f0ee2e11605/420/420/Hat/Png"?>' alt='Foto'></td>
            </tr>
        <?php } ?>
    </table>

    <br>
    <p>Update</p>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Bidang</th>
            <th>Partai</th>
            <th>Foto</th>
        </tr>

        <?php foreach ($listAnggotaDPR as $anggota) { 
                // Mengubah nama anggota dengan ID "1B" menjadi "Sujarwo Tejo"
                if ($anggota->getId() == "1B") $anggota->setName("Sujarwo Tejo"); ?>
            <tr>
                <td><?= $anggota->getId() ?></td>
                <td><?= $anggota->getName() ?></td>
                <td><?= $anggota->getBidang() ?></td>
                <td><?= $anggota->getPartai() ?></td>
                <td><img src='<?= "https://tr.rbxcdn.com/54148d6eef670226565d3f0ee2e11605/420/420/Hat/Png"?>' alt='Foto'></td>
            </tr>
        <?php } ?>

    </table>

    <br>
    <p>Delete</p>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Bidang</th>
            <th>Partai</th>
            <th>Foto</th>
        </tr>

        <?php foreach ($listAnggotaDPR as $anggota) { 
                // Menghapus anggota dengan ID "2A" dari array
                if ($anggota->getId() == "2A") {
                    $key = array_search($anggota, $listAnggotaDPR);
                    if ($key !== false) {
                        array_splice($listAnggotaDPR, $key, 1);
                    }
                    continue;
                }?>
            <tr>
                <td><?= $anggota->getId() ?></td>
                <td><?= $anggota->getName() ?></td>
                <td><?= $anggota->getBidang() ?></td>
                <td><?= $anggota->getPartai() ?></td>
                <td><img src='<?= "https://tr.rbxcdn.com/54148d6eef670226565d3f0ee2e11605/420/420/Hat/Png"?>' alt='Foto'></td>
            </tr>
        <?php } ?>

    </table>

</body>

</html>
