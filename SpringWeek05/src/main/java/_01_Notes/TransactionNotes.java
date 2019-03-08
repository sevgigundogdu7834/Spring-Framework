package main.java._01_Notes;

public class TransactionNotes {
}

// ACID ->
// Atomicity
// - bir transaction bir yada daha fazla islem/adim/is parcacigindan meydana gelir.
// ya hep ya hic kurali vardir! butun adimlar basarili oldugunda tum islem/transaction basarili olmustur.

// Consistent (turkce karsilik tutarli)
// X kisisi 100TL EFT yapiyor, Y kisisi 100TL almalidir.
// cikan miktar ile gelen miktar tutarli olmalidir.

// Isolated (izole / yalitim/ayrilmis)
// locking mantigi , veritabani icin row , table lock
// otobus biletini sectigimizde , ilgili koltuk bizim icin kilitlenir.

// Durability (dayanikli/kalici/saglam)
// transaction tamamlandiginda commit edilmelidir.
// herhangi bir adimda bir problem oldugunda roll back yapilmalidir.


// Spring de transaction yapisi ;
// - Programmatic Transaction
// - Declarative Transaction
