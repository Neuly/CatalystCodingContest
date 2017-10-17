package at.teamlogprog;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BiddingSystem {

	public static void main(String args[]) {
		BiddingSystem bs = new BiddingSystem();
		// System.out.println(bs.geboteDerReihenfolgePrüfen("1, A, 5, B, 10, A, 8, A,
		// 17, B, 17"));
		// System.out.println("\n");
		// System.out.println(bs.geboteDerReihenfolgePrüfen(
		// "1,nepper,15,hamster,24,philipp,30,mmautne,31,hamster,49,thebenil,57,fliegimandi,59,ev,61,philipp,64,ev,74,philipp,69,philipp,71,fliegimandi,78,hamster,78,mio,95,hamster,103,macquereauxpl,135"));
		// System.out.println("\n");
		// System.out.println(bs.geboteDerReihenfolgePrüfen(
		// "1,cable,5,ente,10,karl,19,moehe,14,moehe,23,michbex,24,melloy,25,achi,26"));
		// System.out.println("\n");
		// System.out.println(
		// bs.geboteDerReihenfolgePrüfen("1,cable,5,ente,10,karl,19,moehe,23,michbex,24,melloy,29,achi,26"));
		// System.out.println("\n");
		// System.out.println(
		// bs.geboteDerReihenfolgePrüfen("15,urtyp,17,neuli,16,schlurchi,25,tokay,75,horni,35,sue,60,sue,70"));
		// System.out.println("\n");
		// System.out.println(bs.geboteDerReihenfolgePrüfen("15,urtyp,15"));
		// System.out.println(bs.geboteDerReihenfolgePrüfen("1,A,5,B,10,A,8,A,14,A,17,B,17"));
		// System.out.println(bs.geboteDerReihenfolgePrüfen(
		// "1,nepper,15,hamster,24,philipp,30,mmautne,31,hamster,49,hamster,55,thebenil,57,fliegimandi,59,ev,61,philipp,64,philipp,65,ev,74,philipp,69,philipp,71,fliegimandi,78,hamster,78,mio,95,hamster,103,macquereauxpl,135"));
		// System.out.println(bs.geboteDerReihenfolgePrüfen(
		// "15,urtyp,17,neuli,16,schlurchi,25,tokay,75,horni,35,sue,60,sue,65,gap,70"));
		// System.out.println(bs.geboteDerReihenfolgePrüfen(
		// "100,A,100,A,115,A,119,A,144,A,145,A,157,A,158,A,171,A,179,A,194,A,206,A,207,A,227,A,229,A,231,A,234"));
		// System.out.println(bs.geboteDerReihenfolgePrüfen(
		// "100,C,100,C,115,C,119,C,121,C,144,C,154,C,157,G,158,C,171,C,179,C,194,C,206,C,214,C,227,C,229,C,231,C,298"));
		// System.out.println(bs.historie("1,A,5,B,10,A,8,A,14,A,17,B,17"));
		// System.out.println(bs.historie(
		// "100,A,100,A,115,A,119,A,144,A,145,A,157,A,158,A,171,A,179,A,194,A,206,A,207,A,227,A,229,A,231,A,234"));
		// System.out.println(bs.historie(
		// "100,C,100,C,115,C,119,C,121,C,144,C,154,C,157,G,158,C,171,C,179,C,194,C,206,C,214,C,227,C,229,C,231,C,298"));
		// System.out.println(bs.historie(
		// "1,nepper,15,hamster,24,philipp,30,mmautne,31,hamster,49,hamster,55,thebenil,57,fliegimandi,59,ev,61,philipp,64,philipp,65,ev,74,philipp,69,philipp,71,fliegimandi,78,hamster,78,mio,95,hamster,103,macquereauxpl,135"));
		// System.out.println(bs.historie("15,urtyp,15"));
		// System.out.println(bs.historie(
		// "1,rx,50,aa,2000,de,3558,einseins,3999,ek,4999,yd,8332,lb,5000,lb,6000,lb,7000,lb,8000,lb,8999,yd,9999,zn,11000,ir,11110,nr,12999,kt,12567,kt,12667,kt,13000,go,14000,ym,14999,hm,15400,nr,15690,nr,17000,td,18500,kt,18750,uy,18850,hr,18999,td,19049,st,19200"));
		// System.out.println(bs.historie("1,15,A,5,B,10,A,8,A,17,B,17"));
		// System.out.println(bs.historie("100,0,C,100,C,115,C,119,C,121,C,144,C,154,C,157,G,158,C,171,C,179,C,194,C,206,C,214,C,227,C,229,C,231,C,298"));
		// System.out.println(bs.historie("100,325,C,100,C,115,C,119,C,121,C,144,C,154,C,157,G,158,C,171,C,179,C,194,C,206,C,214,C,227,C,229,C,231,C,298"));
		System.out.println(bs.historie(
				"100,160,C,100,C,115,C,119,C,121,C,144,C,154,C,157,G,158,C,171,C,179,C,194,C,206,C,214,C,227,C,229,C,231,C,298"));
		// System.out.println(bs.historie("1,0,nepper,15,hamster,24,philipp,30,mmautne,31,hamster,49,hamster,55,thebenil,57,fliegimandi,59,ev,61,philipp,64,philipp,65,ev,74,philipp,69,philipp,71,fliegimandi,78,hamster,78,mio,95,hamster,103,macquereauxpl,135"));
		// System.out.println(bs.historie(
		// "1,120,6a,17,kl,5,kl,10,kl,15,cs,28,kl,20,kl,25,hr,35,hr,40,hr,41,hl,42,hr,43,hr,44,hl,44,hl,49,hr,47"));
		System.out.println(bs.historie(
				"1,47,6a,17,kl,5,kl,10,kl,15,cs,28,kl,20,kl,25,hr,35,hr,40,hr,41,hl,42,hr,43,hr,44,hl,44,hl,49,hr,47"));
	}

	public String historie(String input) {
		String[] values = input.split(",");
		Integer startgebot = Integer.parseInt(values[0]);
		Integer sofortKauf = Integer.parseInt(values[1]);
		ArrayList<BieterGebot> bglist = parseValuesIntoAnArrayList(values);
		StringBuilder sb = new StringBuilder("-," + startgebot);
		StringBuilder uebergabeParameter = new StringBuilder(startgebot + "," + sofortKauf + ",");
		String currentValue = "";
		String lastValue = "NichtCurrentValue";
		for (int i = 0; i < bglist.size(); i++) {
			uebergabeParameter.append(bglist.get(i));
			currentValue = geboteDerReihenfolgePrüfen(uebergabeParameter.toString());
			if (sofortKauf != 0 && bglist.get(i).gebot >= sofortKauf) {
				currentValue = geboteDerReihenfolgePrüfen(input);
				sb.append(",");
				int value = Integer.parseInt(currentValue.split(",")[1]);
				sb.append(currentValue.split(",")[0] + "," + (value >= sofortKauf ? sofortKauf : value));
			} else if (!lastValue.equals(currentValue)) {
				System.out.print(uebergabeParameter.toString() + " -> ");
				sb.append(",");
				sb.append(currentValue);
				System.out.println(uebergabeParameter.toString());
			}
			lastValue = currentValue;
			uebergabeParameter.append(",");
		}
		System.out.println(sb.toString());
		return sb.toString();
	}

	public String geboteDerReihenfolgePrüfen(String input) {
		String[] values = input.split(",");
		Integer startgebot = Integer.parseInt(values[0]);

		ArrayList<BieterGebot> bglist = parseValuesIntoAnArrayList(values);

		if (bglist.size() == 1) {
			return bglist.get(0).bieterName + "," + startgebot;
		}

		final Comparator<BieterGebot> comp = (p1, p2) -> Integer.compare(p1.gebot, p2.gebot);
		final BieterGebot maxVonVorneOverall = bglist.stream().max(comp).get();
		int indexOfMaxVonVorneGelesen = bglist.indexOf(maxVonVorneOverall);

		System.out.println("maxVonVorneGelesen -> " + maxVonVorneOverall.toString());
		System.out.println("indexOfMaxVonVorneGelesen -> " + indexOfMaxVonVorneGelesen);

		if (zweiGleicheHoechstgebote(bglist, maxVonVorneOverall.gebot)) {
			System.out.println(" -> zweiGleicheHoechstgebote ");
			return maxVonVorneOverall.toString();
		}
		// zweitkleinstes finden und +1 retournieren
		List<BieterGebot> bglistContainingMinimumLeftSide = indexOfMaxVonVorneGelesen == 0 ? bglist
				: bglist.subList(0, indexOfMaxVonVorneGelesen);
		BieterGebot maxVonMinSublistLS = null;
		if (bglist.stream().allMatch(p1 -> p1.bieterName.compareTo(maxVonVorneOverall.bieterName) == 0)) {
			maxVonMinSublistLS = bglistContainingMinimumLeftSide.stream().max(comp).get();
		} else {
			maxVonMinSublistLS = bglistContainingMinimumLeftSide.stream()
					.filter(p1 -> p1.bieterName.compareTo(maxVonVorneOverall.bieterName) != 0).max(comp).get();
		}

		BieterGebot vergleichsGebot = null;
		if (!(indexOfMaxVonVorneGelesen == bglist.size() - 1)) {
			List<BieterGebot> bgListContainingMinimumRightSide = bglist.subList(indexOfMaxVonVorneGelesen + 1,
					bglist.size());
			BieterGebot maxVonMinSubListRS = bgListContainingMinimumRightSide.stream().max(comp).get();

			vergleichsGebot = maxVonMinSublistLS.gebot > maxVonMinSubListRS.gebot ? maxVonMinSublistLS
					: maxVonMinSubListRS;
		} else
			vergleichsGebot = maxVonMinSublistLS;

		System.out.println("maxVonMinSublist -> " + vergleichsGebot.toString());
		if (maxVonVorneOverall.bieterName.compareTo(vergleichsGebot.bieterName) == 0) {
			final String bieterName = vergleichsGebot.bieterName;
			BieterGebot minVonVorneOverall = bglist.stream().filter(p1 -> p1.bieterName.compareTo(bieterName) == 0)
					.min(comp).get();
			return maxVonVorneOverall.bieterName + "," + (minVonVorneOverall.gebot);
		}

		return maxVonVorneOverall.bieterName + "," + (vergleichsGebot.gebot + 1);
	}

	private boolean zweiGleicheHoechstgebote(ArrayList<BieterGebot> bglist, int maximum) {
		return bglist.stream().filter(p1 -> (p1.gebot >= maximum)).count() > 1;
	}

	private ArrayList<BieterGebot> parseValuesIntoAnArrayList(String[] values) {
		ArrayList<BieterGebot> bglist = new ArrayList<>();

		for (int i = 2; i < values.length; i += 2) {
			String name = values[i].trim();
			Integer gebot = Integer.parseInt(values[i + 1].trim());
			bglist.add(new BieterGebot(gebot, name));
		}
		return bglist;
	}

}

class BieterGebot {
	public int gebot;
	public String bieterName;

	public BieterGebot(int g, String b) {
		this.gebot = g;
		this.bieterName = b;
	}

	@Override
	public String toString() {
		return bieterName + "," + gebot;
	}

}