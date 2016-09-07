package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Controller.Search;
import View.Frames;

public class PillCollection
{
	private Search search;
	private Frames frames;
	
	public List<Pills> pillDB = new ArrayList<Pills>();
	
	//The Format: 
	//public Pills (String ID, String color, String color2, String shape, 
			//String country, String tags, String status, String imgPath, String thumbPath, String comments)
	
	//Added 23/08/16. 
	Pills thiamine1 = new Pills("Thiamine", "White", "No Color", "Round", "Thailand", "white,round,biconvex,10,round,star,square,round,ten,shape,thiamine,vitamin,B1,release, thailand", "Release", "img/thiamine1.jpg", "img/thumbnailThiamine1.jpg", "White round tablets with biconvex faces. The tablets had an impression of ‘10’ on one side, an impression of a round within a 4-pointed star shape on the other side. The analysis performed indicates that these tablets contain thiamine (vitamin B1) and other ingredients. There is no evidence that this exhibit contains any controlled drug substances. ");
	Pills diazepam1 = new Pills("Diazepam", "White", "No Color", "Round", "Thailand", "white, round,tablet,flat,2,two,hexagon,R, imprint,P,L,diazepam,controlled,benzodiazepine, schedule,IV,seize,thailand", "Seize", "img/diazepam1.jpg", "img/thumbnailDiazepam1.jpg", "White round tablets with flat faces. The tablets had and impression of a ‘2’ inside a hexagon outline with two interior parallel lines on one side and an over lapping ‘P’ and ‘L’ inside another hexagon outline with two interior parallel lines on the other side. Based on the analysis, these tablets contain diazepam and other ingredients. Diazepam is a controlled substance under item 18 [‘Benzodiazepines, their salts and derivatives’] of Schedule IV of the Controlled Drugs and Substances Act. ");
	Pills phentermine1 = new Pills("Phentermine", "Red", "White", "Capsule", "Thailand", "red,white,capsule,P15,P,15,spheres,phentermine,dimethylbenzeneethanamine,schedule,IV, seize,controlled,thailand", "Seize", "img/phentermine1.jpg", "img/thumbnailPhentermine1.jpg", "Red and white 2-piece capsules. The capsules had ‘P 15’ printed in white on the red piece and contained white spheres. Based on the analysis, these capsules contain phentermine and other ingredients. Phentermine is a controlled substance under item 8 [‘Phentermine (α,α-dimethylbenzeneethanamine) and any salt thereof’] of Schedule IV of the Controlled Drugs and Substances Act. ");
	Pills diazepam2 = new Pills("Diazepam", "yellow", "No Color", "Round", "Thailand", "yellow,round,tablet,flat,5,hexagon,P,L,R,diazepam,controlled,benzodiazepine,schedule,IV,thailand,seize", "Seize", "img/diazepam2.jpg", "img/thumbnailDiazepam2.jpg", "Yellow round tablets with flat faces. The tablets had and impression of a 5 inside a hexagon outline with two interior parallel lines on one side and an over lapping ‘P’ and ‘L’ inside another hexagon outline with two interior parallel lines on the other side. Based on the analysis, these tablets contain diazepam and other ingredients. Diazepam is a controlled substance under item 18 [‘Benzodiazepines, their salts and derivatives’] of Schedule IV of the Controlled Drugs and Substances Act. ");
	Pills fluoxetine1 = new Pills("Fluoxetine", "Orange", "No Color", "Capsule", "Thailand", "orange,capsule,fluoxetine,health,canada,thailand,prescription", "Health Canada", "img/fluoxetine1.jpg", "img/thumbnailFluoxetine1.jpg", "Orange 2-piece capsules containing white powder. Based on the analysis, these tablets contain fluoxetine and other ingredients. Fluoxetine is covered under ‘Fluoxetine or its salts’ in Health Canada’s Prescription Drug List. ");
	Pills propranolol1 = new Pills("Propranolol", "Red", "No Color", "Round", "Thailand", "red,pink,round,tablet,biconvex,scoreline,propranolol,health,canada,thailand,prescription", "Health Canada", "img/propranolol1.jpg", "img/thumbnailPropranolol1.jpg", "Red-pink round tablets with biconvex faces. The tablets had a scoreline on one side. Based on the analysis, these tablets contain propranolol and other ingredients. Propranolol is covered under ‘Propranolol or its salts’ in Health Canada’s Prescription Drug List. ");
	Pills bisacodyl1 = new Pills("Bisacodyl", "Yellow", "No Color", "Round", "Thailand", "yellow,round,biconvex,bisacodyl,otc,over,counter,release,thailand", "Release", "img/bisacodyl1.jpg", "img/thumbnailBisacodyl1.jpg", "Yellow round tablets with biconvex faces. Based on the analysis, these tablets contain bisacodyl and other ingredients. Bisacodyl is available in over-the-counter medications in Canada. ");
	Pills hydrochlorothiazide1 = new Pills("Hydrochlorothiazide", "Orange", "No Color", "Round", "Thailand", "orange,pink,round,tablet,flat,T,0,O,scoreline,hydrochlorothiazide,chlorothiazide,health,canada,thailand,prescription", "Health Canada", "img/hydrochlorothiazide1.jpg", "img/thumbnailHydrochlorothiazide1.jpg", "Orange-pink round tablets with flat faces and bevelled edges. The tablets had an impression of ‘T’ and ‘0’ on either side of a scoreline on one side. Based on the analysis, these tablets contain hydrochlorothiazide (a derivative of chlorothiazide) and other ingredients.  Hydrochlorothiazide is a derivative of chlorothiazide. ‘Chlorothiazide or its salts or derivatives’ are covered under Health Canada’s Prescription Drug List. ");
	Pills fluoxetine2 = new Pills("Fluoxetine", "green", "yellow", "capsule", "thailand", "green,yellow,capsule,fluoxetine,hydrochloride,health,canada,thailand,prescription", "Health Canada", "img/fluoxetine2.jpg", "img/thumbnailFluoxetine2.jpg", "Green and yellow 2-piece capsules. Based on the analysis, these capsules contain fluoxetine hydrochloride and other ingredients. Fluoxetine hydrochloride is covered under ‘Fluoxetine or its salts’ in Health Canada’s Prescription Drug List. ");
	Pills phentermine2 = new Pills("Phentermine", "Blue", "White", "Capsule", "Thailand", "blue,white,capsule,P15,P,15,spheres,phentermine,dimethylbenzeneethanamine,schedule,IV, seize,controlled,thailand", "Seize", "img/phentermine2.jpg", "img/thumbnailPhentermine2.jpg", "Blue and white 2-piece capsules. The capsules had ‘P 15’ printed in white on the blue piece and contained white spheres. Based on the analysis, these capsules contain phentermine and other ingredients. Phentermine is a controlled substance under item 8 [‘Phentermine (α,α-dimethylbenzeneethanamine) and any salt thereof’] of Schedule IV of the Controlled Drugs and Substances Act. ");
	Pills propranolol2 = new Pills("Propranolol", "Red", "No Color", "Oval", "Thailand", "red,pink,oval,tablet,biconvex,scoreline,propranolol,health,canada,thailand,prescription", "Health Canada", "img/propranolol2.jpg", "img/thumbnailPropanolol2.jpg", "Red-pink oval tablets with biconvex faces. The tablets had a scoreline on one side. Based on the analysis, these tablets contain propranolol and other ingredients. Propranolol is covered under ‘Propranolol or its salts’ in Health Canada’s Prescription Drug List. ");
	Pills diazepam3 = new Pills("Diazepam", "Yellow", "No Color", "Round", "Thailand", "yellow,round,tablet,flat,2,two,R,imprint,P,L,diazepam,controlled,benzodiazepine,schedule,IV,seize,thailand", "Seize", "img/diazepam3.jpg", "img/thumbnailDiazepam3.jpg", "Yellow round tablets with flat faces. The tablets had and impression of a ‘5’ inside a hexagon outline with two interior parallel lines on one side and an over lapping ‘P’ and ‘L’ inside another hexagon outline with two interior parallel lines on the other side.Based on the analysis, these tablets contain diazepam and other ingredients.	Diazepam is a controlled substance under item 18 [‘Benzodiazepines, their salts and derivatives’] of Schedule IV of the Controlled Drugs and Substances Act. ");
	Pills fluoxetine3 = new Pills("Fluoxetine", "Orange", "Blue", "Capsule", "Thailand", "orange,blue,capsule,fluoxetine,health,canada,thailand,prescription", "Health Canada", "img/fluoxetine3.jpg", "img/thumbnailFluoxetine3.jpg", "Orange and blue 2-piece capsules containing white powder. Based on the analysis, these tablets contain fluoxetine and other ingredients. Fluoxetine is covered under ‘Fluoxetine or its salts’ in Health Canada’s Prescription Drug List. ");
	Pills pyridoxine1 = new Pills("Pyridoxine", "Yellow", "No Color", "Round", "Thailand", "yellow,round,round,10,ten,scoreline,release,pyridoxine,vitamin, b6 ,thailand", "Release", "img/pyridoxine1.jpg", "img/thumbnailPyridoxine1.jpg", "Yellow round tablets with biconvex faces. The tablets had an impression of ‘10’ on one side, a scoreline on the other side. The analysis performed indicates that these tablets contain pyridoxine (vitamin B6) and other ingredients. There is no evidence that this exhibit contains any controlled drug substances. ");
	Pills phentermine3 = new Pills("Phentermine", "Red", "Grey", "Capsule", "Thailand", "red,grey,capsule,duromine,30,thirty,phentermine,dimethylbenzeneethanamine,schedule,IV,seize,controlled,thailand", "Seize", "img/phentermine3.jpg", "img/thumbnailPhentermine3.jpg", "Red and grey 2-piece capsules. The capsules had ‘Duromine 30’ printed in white on the red piece.Based on the analysis, these capsules contain phentermine and other ingredients. Phentermine is a controlled substance under item 8 [‘Phentermine (α,α-dimethylbenzeneethanamine) and any salt thereof’] of Schedule IV of the Controlled Drugs and Substances Act. ");
	Pills diazepam4 = new Pills("Diazepam", "Blue", "No Color", "Round", "Thailand", "blue,round,tablet,flat,2,two,hexagon,R,imprint,P,L,diazepam,controlled,benzodiazepine,schedule,IV,seize,thailand", "Seize", "img/diazepam4.jpg", "img/thumbnailDiazepam4.jpg", "Blue round tablets with flat faces. The tablets had and impression of a ‘10’ inside a hexagon outline with two interior parallel lines on one side and an over lapping ‘P’ and ‘L’ inside another hexagon outline with two interior parallel lines on the other side. Based on the analysis, these tablets contain diazepam and other ingredients. Diazepam is a controlled substance under item 18 [Benzodiazepines, their salts and derivatives] of Schedule IV of the Controlled Drugs and Substances Act. ");
	Pills domperidone1 = new Pills("Domperidone", "White", "No Color", "Round", "Thailand", "white,round,tablet,D,10,N,L,imprint,domperidone,health,canada,Thailand,prescription", "Health Canada", "img/domperidone1.jpg", "img/thumbnailDomperidone1.jpg", "White round tablets. The tablets had an impression of a D above a 10 on one side and an over lapping N and L on the other side. Based on the analysis, these tablets contain Domperidone. Domperidone is covered under Domperidone in Health Canada’s Prescription Drug List. ");
	Pills medroxyprogesteroneacetate1 = new Pills("MedroxyprogesteroneAcetate", "White", "No Color", "Hexagon", "Thailand", "white,hexagon,tablet,5,five,provera,scoreline,imprint,medroxyprogesterone,acetate,health,canada,Thailand,prescription", "Health Canada", "img/medroxyprogesteroneacetate1.jpg", "img/thumbnailMedroxyprogesteroneacetate1.jpg", "White hexagon shaped tablets. The tablets had an impression of a 5 and the words PROVERA on one side and a scoreline on the other side. Based on the analysis, these tablets contain Medroxyprogesterone acetate. Medroxyprogesterone acetate is covered under Sex hormones (Natural or synthetic) in Health Canada’s Prescription Drug List. ");
	Pills omeprazole1 = new Pills("Omeprazole", "Purple", "No Color", "Packaging", "Fiji", "purple,packaging,miliom,20,omeprazole,health,canada,Fiji,prescription","Health Canada", "img/omeprazole1.jpg", "img/thumbnailOmeprazole1.jpg", "Pills in purple packaging labelled ‘Miliom-20’.  Based on the analysis, these tablets contain Omeprazole. Omeprazole is covered under ‘Omeprazole or its salts’ in Health Canada’s Prescription Drug List. ");
	Pills isosorbidemononitrate1 = new Pills("Isosorbide Mononitrate", "White", "No Color", "Oval", "Philippines", "white,oval,tablet,biconvex,scoreline,isosorbide,mononitrate,release,philippines","Release", "img/isosorbidemononitrate1.jpg", "img/thumbnailIsosorbideMononitrate1.jpg", "White oval tablets with biconvex faces. The tablets had a scoreline on one side. The analysis performed indicates that these tablets contain Isosorbide Mononitrate. There is no evidence that this exhibit contains any controlled drug substances. ");
	Pills clopidogrel1 = new Pills("Clopidogrel", "Silver", "Purple", "Packaging", "Philippines", "clopidogrel,silver,purple,packaging,philippines,health,canada,prescription","Health Canada", "img/clopidogrel1.jpg", "img/thumbnailClopidogrel1.jpg", "Pills in silver packaging with purple writing labelled ‘CLOPIDOGREL’.  Based on the analysis, these tablets contain Clopidogrel. Clopidogrel is covered under ‘Clopidogrel or its salts’ in Health Canada’s Prescription Drug List. ");
	Pills trimetazidine1 = new Pills("Trimetazidine", "Pink", "No Color", "Round", "Philippines", "trimetazidine,pink,red,orange,salmon,round,philippines,release","Release", "img/trimetazidine1.jpg", "img/thumbnailTrimetazidine1.jpg", "Pink (salmon colored) round tablets.  The analysis performed indicates that these tablets contain Trimetazidine. There is no evidence that this exhibit contains any controlled drug substances. ");
	Pills lifetransferfactorplus = new Pills("4life Transfer Factor Plus", "N/A", "N/A", "N/A", "USA", "4life,transfer,factor,plus,usa,united,states,America,release","Release", "img/4lifetransferplus.jpg", "img/thumbnail4lifetransferplus.jpg", "Release these pills. No controlled substances. ");
	Pills flcld = new Pills("#5 Fl-Cld", "N/A", "N/A", "N/A", "USA", "5,flcld,5flcld,fl,cld,nutriwest,nutri,west,usa,united,states,America,release","Release", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Release these pills. No controlled substances. ");
	Pills inoneformen = new Pills("12-in-one for Men", "N/A", "N/A", "N/A", "USA", "12,in,one,for,men,12inoneformen,ultimate,nutraceuticals,health,Canada,usa,united states,America","Health Canada", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Refer to Health Canada. ");
	Pills inoneforwomen = new Pills("12-in-one for Women", "N/A", "N/A", "N/A", "USA", "12,in,one,for,women,12inoneforwomen,ultimate,nutraceuticals,health,Canada,usa,united states,America","Health Canada", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Refer to Health Canada. ");
	Pills dayfatflusher = new Pills("2 Day Fat Flusher", "N/A", "N/A", "N/A", "USA", "2dayfatflusher,2,two,day,fat,flusher,decaslimco,decaslim,usa,united,states,America,release","Release", "img/2dayfatflusher.jpg", "img/thumbnail2dayfatflusher.jpg", "Release these pills. No controlled substances. ");
	Pills lifetransferfactorbellevie = new Pills("4life Transfer Factor Belle Vie", "N/A", "N/A", "N/A", "USA", "4life,transfer,factor,belle,vie,usa,united,states,America,release","Release", "img/4lifetransferfactorbellevie.jpg", "img/thumbnail4lifetransferfactorbellevie.jpg", "Release these pills. No controlled substances. ");
	Pills htpessential = new Pills("5-HTP", "N/A", "N/A", "N/A", "USA", "5htp,5,htp ,usa,united,states,America,release,essential,therapeutics","Release", "img/5htpessential.jpg", "img/thumbnail5htpessential.jpg", "Release these pills. No controlled substances. ");
	Pills mthfthorne = new Pills("5-MTHF", "N/A", "N/A", "N/A", "USA", "5htp,5,htp ,usa,united,states,America,release,essential,therapeutics","Release", "img/5mthfthorne.jpg", "img/thumbnail5mthfthorne.jpg", "Release these pills. No controlled substances. ");

	//Added 24/08/16. 
	Pills dfbx1 = new Pills("7-DFBX", "N/A", "N/A", "N/A", "USA", "7DFBX,7,dfbx,devmin,release,usa,united,states,america", "Release", "img/dfbx1.jpg", "img/thumbnaildfbx1.jpg", "Release these pills. No controlled substances. ");
	Pills keto1 = new Pills("7-Keto", "N/A", "N/A", "N/A", "USA", "7Keto,7,keto,now,foods,seize,usa,united,states,America,controlled", "Seize", "img/keto1.jpg", "img/thumbnailketo1.jpg", "Contains a controlled substance. Seize these goods. ");
	Pills acaiclubnatural1 = new Pills("Acai", "N/A", "N/A", "N/A", "USA", "acai,club,natural,inc,release,usa,united,states,america", "Release", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Release these pills. No controlled substances. ");
	Pills acaiberrypower1 = new Pills("Acai Berry Power Diet", "N/A", "N/A", "N/A", "USA", "acai,berry,power,diet,natural,style,release,usa,united,states,america", "Release", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Release these pills. No controlled substances. ");
	Pills acaiburn1 = new Pills("Acai Burn", "N/A", "N/A", "N/A", "USA", "acai,burn,acaiburn,release,usa,united,states,America", "Release", "img/acaiburn1.jpg", "img/thumbnailacaiburn1.jpg", "Release these pills. No controlled substances. ");
	Pills acaiplus1 = new Pills("Acai Plus", "N/A", "N/A", "N/A", "USA", "acai,plus,triunity,international,release,usa,united,states,america", "Release", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Release these pills. No controlled substances. ");
	Pills acaiaslim1 = new Pills("Acai-aSlim", "N/A", "N/A", "N/A", "USA", "acai,aslim,acaiaslim,panalabs,release,usa,united,states,america", "Release", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Release these pills. No controlled substances. ");
	Pills abmroyal1 = new Pills("ABM Royal Sun Agaricus", "N/A", "N/A", "N/A", "USA", "abm,royal,sun,agaricus,Hawaiian,health,products,release,usa,united,states,america", "Release", "img/abmroyal1.jpg", "img/thumbnailabmroyal11.jpg", "Release these pills. No controlled substances. ");
	Pills accelerator1 = new Pills("Accelerator", "N/A", "N/A", "N/A", "USA", "accelerator,fulfillment,centre,release,usa,united,states,America", "Release", "img/accelerator1.jpg", "img/thumbnailaccelerator1.jpg", "Release these pills. No controlled substances. ");
	Pills acetyllcarnitine1 = new Pills("Acetyl L Carnitine", "N/A", "N/A", "N/A", "USA", "acetyl,l,carnitine,acetyllcarnitine,physician,formulas,inc,health,canada,usa,united,states,america", "Health Canada", "img/acetyllcarnitine1.jpg", "img/thumbnailacetyllcarnitine1.jpg", "Refer these pills to Health Canada. ");
	Pills acetylglutathione1 = new Pills("Acetyl-Glutathione", "N/A", "N/A", "N/A", "USA", "acetylglutathione,acetyl,glutathione,the,maplewood,company,release,usa,united,states,america", "Release", "img/acetylglutathione1.jpg", "img/thumbnailacetylglutathione1.jpg", "Release these pills. No controlled substances. ");
	Pills acidoll1 = new Pills("Acidoll", "N/A", "N/A", "N/A", "USA", "acidoll,the,key,company,release,usa,united,states,america", "Release", "img/acidoll1.jpg", "img/thumbnailacidoll1.jpg", "Release these pills. No controlled substances. ");
	Pills acs200 = new Pills("ACS200", "N/A", "N/A", "N/A", "USA", "acs200,results,rna,release,usa,united,states,america", "Release", "img/acs200.jpg", "img/thumbnailacs200.jpg", "Release these pills. No controlled substances. ");
	Pills acssupershot = new Pills("ACS200 Supershot", "N/A", "N/A", "N/A", "USA", "acs200,supershot,results,rna,release,usa,united,states,america", "Release", "img/acssupershot.jpg", "img/thumbnailacssupershot.jpg", "Release these pills. No controlled substances. ");
	Pills activotc = new Pills("Activ OTC/Epimedafil", "N/A", "N/A", "N/A", "USA", "activ,otc,epimedafil,u,neek,products,cites,usa,united,states,america", "CITES", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Refer these pills to CITES. ");
	Pills activedigestiveenzymes = new Pills("Active Digestive Enzymes", "N/A", "N/A", "N/A", "USA", "active,digestive,enzymes,innovative,nutraceuticals,release,usa,united,states,america", "Release", "img/activedigestiveenzymes.jpg", "img/thumbnailactivedigestiveenzymes.jpg", "Release these pills. No controlled substances. ");
	Pills acznano = new Pills("ACZnano", "N/A", "N/A", "N/A", "USA", "acznano,results,rna,release,usa,united,states,america", "Release", "img/acznano.jpg", "img/thumbnailactiveacznano.jpg", "Release these pills. No controlled substances. ");
	Pills adalatretard20 = new Pills("Adalat retard 20", "N/A", "N/A", "N/A", "USA", "adalat,retard,20,nifedipino,health,canada,usa,united,states,america", "Health Canada", "img/adalatretard20.jpg", "img/thumbnailadalatretard20.jpg", "Refer these pills to Health Canada. ");
	Pills adrenacort = new Pills("AdrenaCort", "N/A", "N/A", "N/A", "USA", "adrenacort,adrena,cort,karuna,corporation,release,usa,united,states,america", "Release", "img/adrenacort.jpg", "img/thumbnailadrenacort.jpg", "Release these pills. No controlled substances. ");
	Pills adrenalcformula = new Pills("Adrenal C Formula", "N/A", "N/A", "N/A", "USA", "adrenal,c,formula,future,formulations,llc,release,usa,united,states,america", "Release", "img/adrenalcformula.jpg", "img/thumbnailadrenalcformula.jpg", "Release these pills. No controlled substances. ");

	//Added 26/08/16
	Pills fluoxentineffffppp = new Pills("Fluoxetine hydrochloride", "Yellow", "No Color", "Oval", "Thailand", "fluoxetine,hydrochloride,yellow,oval,thailand,health,canada,pml,scoreline", "Health Canada", "img/fluoxentineffffppp.jpg", "img/thumbnailfluoxentineffffppp.jpg", "Based on the analysis, these exhibits contain fluoxetine hydrochloride and other substances. Fluoxetine hydrochloride is covered under Health Canada’s Prescription Drug List. ");
	Pills fluoxentinehydroxxkk = new Pills("Fluoxetine hydrochloride", "Pink", "No Color", "Oval", "Thailand", "fluoxetine,hydrochloride,pink,oval,thailand,health,canada,scoreline", "Health Canada", "img/fluoxentinehydroxxkk.jpg", "img/thumbnailfluoxentinehydroxxkk.jpg", "Based on the analysis, these exhibits contain fluoxetine hydrochloride and other substances. Fluoxetine hydrochloride is covered under Health Canada’s Prescription Drug List. ");
	Pills bisacodylahht= new Pills("Bisacodyl", "Orange", "No Color", "Round", "Thailand", "bisacodyl,orange,round,thailand,otc,release", "Release", "img/bisacodylahht.jpg", "img/thumbnailbisacodylahht.jpg", "Based on the analysis, these tablets contain bisacodyl and other substances. Bisacodyl is available in over-the-counter preparations. ");
	Pills adrenalcortex = new Pills("Adrenal Cortex", "N/A", "N/A", "N/A", "USA", "adrenal,cortex,essential,therapeutics,release,usa,united,states,america", "Release", "img/adrenalcortex.jpg", "img/thumbnailadrenalcortex.jpg", "These pills are not controlled. Recommended release. ");
	Pills adrenalrebuilder = new Pills("Adrenal Rebuilder", "N/A", "N/A", "N/A", "USA", "adrenal,rebuilder,future,formulations,llc,release,usa,united,states,america", "Release", "img/adrenalrebuilder.jpg", "img/thumbnailadrenalrebuilder.jpg", "These pills are not controlled. Recommended release. ");
	Pills adrenaladrenolyphsym = new Pills("Adrenal Rebuilder", "N/A", "N/A", "N/A", "USA", "adrenal,rebuilder,nutri,west,nutriwest,release,usa,united,states,america", "Release", "img/adrenolyphsym.jpg", "img/thumbnailadrenolyphsym.jpg", "These pills are not controlled. Recommended release. ");
	Pills adrenaladrenolyphplus = new Pills("Adreno-Lyph-Plus", "N/A", "N/A", "N/A", "USA", "adreno,lyph,plus,nutriwest,nutri,west,release,usa,united,states,america", "Release", "img/adrenolyphsym.jpg", "img/thumbnailadrenolyphsym.jpg", "These pills are not controlled. Recommended release. ");
	Pills adresetadrenalfomula = new Pills("Adreset Adrenal Fomula", "N/A", "N/A", "N/A", "USA", "adreset,adrenal,formula,metagenics,inc,release,usa,united,states,america", "Release", "img/adresetadrenalformula.jpg", "img/thumbnailadresetadrenalformula.jpg", "These pills are not controlled. Recommended release. ");
	Pills ayurdanasaldrops = new Pills("Ayurda Nasal Drops", "N/A", "N/A", "N/A", "USA", "ayurda,nasal,drops,ayurvedic,health,care,release,usa,united,states,america", "Release", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "No controlled substances. Recommended release. ");
	Pills advaclear = new Pills("Advaclear", "N/A", "N/A", "N/A", "USA", "advaclear, metagenics,inc,release,usa,united,states,america", "Release", "img/advaclear.jpg", "img/thumbnailadvaclear.jpg", "These pills are not controlled. Recommended release. ");
	Pills b100plus = new Pills("B-100 Plus", "N/A", "N/A", "N/A", "USA", "b100,b,100,plus,our,health,coop,co,op,release,usa,united,states,america", "Release", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "These pills are not controlled. Recommended release. ");
	Pills magnesiumvitamin = new Pills("B-6/Magnesium Vitamin/Mineral Chewable Wafers", "N/A", "N/A", "N/A", "USA", "b6,magnesium,vitamin,mineral,chewable,wafers,release,usa,united,states,america,kirkman", "Release", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "These pills are not controlled. Recommended release. ");
	Pills banguyen = new Pills("Ba Nguyen", "N/A", "N/A", "N/A", "USA", "ba,nguyen,american,chinese,natural,herbs,inc,release,usa,united,states,america", "Release", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "These pills are not controlled. Recommended release. ");
	Pills banderol = new Pills("Banderol", "N/A", "N/A", "N/A", "USA", "banderol,release,usa,united,states,america,nutramedix", "Release", "img/banderol.jpg", "img/thumbnailbanderol.jpg", "These pills are not controlled. Recommended release. ");
	Pills bcbeyondchelation = new Pills("BC Beyond Chelation", "N/A", "N/A", "N/A", "USA", "bc,beyond,chelation,release,usa,united,states,america,longevity,plus", "Release", "img/bcbeyondchelation.jpg", "img/thumbnailbcbeyondchelation.jpg", "These pills are not controlled. Recommended release. ");
	Pills beecaps = new Pills("Bee Caps", "N/A", "N/A", "N/A", "USA", "bee,caps,release,usa,united,states,america,nature,cure", "Release", "img/beecaps.jpg", "img/thumbnailbeecaps.jpg", "These pills are not controlled. Recommended release. ");
	Pills beepollen = new Pills("Bee Pollen", "N/A", "N/A", "N/A", "USA", "bee,pollen,release,usa,united,states,america,Indiana,botanic,gardens,inc", "Release", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "These pills are not controlled. Recommended release. ");
	Pills bestresveratrol = new Pills("Best Resveratrol", "N/A", "N/A", "N/A", "USA", "best,resveratrol,release,usa,united,states,america,doctors,best", "Release", "img/bestresveratrol.jpg", "img/thumbnailbestresveratrol.jpg", "These pills are not controlled. Recommended release. ");
	Pills betacarotene = new Pills("Beta Carotene", "N/A", "N/A", "N/A", "USA", "beta,carotene,release,usa,united,states,america,self,health,resource,centre", "Release", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "These pills are not controlled. Recommended release. ");
	Pills betafood1450 = new Pills("Betafood 1450", "N/A", "N/A", "N/A", "USA", "betafood,1450,release,usa,united,states,america,standard,process,inc", "Release", "img/betafood1450.jpg", "img/thumbnailbetafood1450.jpg", "These pills are not controlled. Recommended release. ");
	Pills betainehcl = new Pills("Betaine HCI", "N/A", "N/A", "N/A", "USA", "betaine,hcl,release,usa,united,states,america,now,foods", "Release", "img/betainehci.jpg", "img/thumbnailbetainehci.jpg", "These pills are not controlled. Recommended release. ");
	Pills bimectin = new Pills("Bimectin/Ivermectin", "N/A", "N/A", "N/A", "USA", "bimectin,ivermectin,health,canada,usa,united,states,america,bimeda", "Health Canada", "img/bimectinivermectin.jpg", "img/thumbnailbimectinivermectin.jpg", "Refer to Health Canada. ");
	Pills bioactiveq = new Pills("Bio Active Q", "N/A", "N/A", "N/A", "USA", "bio,active,q,release,usa,united,states,america,healthy,directions", "Release", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "These pills are not controlled. Recommended release. ");
	Pills biocardio = new Pills("Bio-Cardio", "N/A", "N/A", "N/A", "USA", "bio,cardio,health,canada,usa,united,states,america,thorne,research", "Health Canada", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Refer to Health Canada. ");
	Pills brn2 = new Pills("BRN-2", "N/A", "N/A", "N/A", "USA", "brn,2,brn2,american,cellular,labs,usa,united,states,america,cites", "CITES", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Refer to CITES. ");
	Pills carvedilol = new Pills("Carvedilol", "N/A", "N/A", "N/A", "USA", "carvedilol,health,canada,usa,united,states,america,biosintetica", "Health Canada", "img/carvedilol.jpg", "img/thumbnailcarvedilol.jpg", "Refer to Health Canada. ");
	Pills cialis = new Pills("Cialis", "N/A", "N/A", "N/A", "USA", "cialis,health,canada,usa,united,states,america,lilly", "Health Canada", "img/cialis.jpg", "img/thumbnailcialis.jpg", "Refer to Health Canada. ");
	Pills claextreme = new Pills("CLA Extreme", "N/A", "N/A", "N/A", "USA", "cla,extreme,health,canada,usa,united,states,america,now,sports", "Health Canada", "img/claextreme.jpg", "img/thumbnailclaextreme.jpg", "Refer to Health Canada. ");
	Pills coenzymebcomplex = new Pills("Co-Enzyme B Complex", "N/A", "N/A", "N/A", "USA", "co,enzyme,b,complex,health,canada,usa,united,states,america,ecological,formulas", "Health Canada", "img/coenzymebcomplex.jpg", "img/thumbnailcoenzymebcomplex.jpg", "Refer to Health Canada. ");
	Pills anoretix = new Pills("Anoretix", "N/A", "N/A", "N/A", "USA", "anoretix,usa,united,states,america,seize", "Seize", "img/anoretix.jpg", "img/thumbnailanoretix.jpg", "Seize these pills. ");
	Pills atrophex = new Pills("Atro-Phex", "N/A", "N/A", "N/A", "USA", "atrophex,atro,phex,usa,united,states,america,bio,engineered,supplements,seize", "Seize", "img/atrophex.jpg", "img/thumbnailatrophex.jpg", "Seize these pills. ");
	Pills dehydrone15 = new Pills("Dehydrone-15", "N/A", "N/A", "N/A", "USA", "dehydrone15,dehydrone,15,seize,usa,united,states,america,thorne,research", "Seize", "img/dehydrone15.jpg", "img/thumbnaildehydrone15.jpg", "Seize these pills. ");
	Pills deriphyllinretard300 = new Pills("Deriphyllin retard 300", "N/A", "N/A", "N/A", "USA", "deriphyllin,retard,300,health,canada,usa,united,states,america,zydus,healthcare", "Health Canada", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Refer to Health Canada. ");
	Pills dhea= new Pills("DHEA", "N/A", "N/A", "N/A", "USA", "dhea,seize,natrol,usa,united,states,america", "Seize", "img/dhea.jpg", "img/thumbnaildhea.jpg", "Seize these pills. ");
	Pills dietsupport= new Pills("Diet Support", "N/A", "N/A", "N/A", "USA", "diet,support,health,canada,now,sports,usa,united,states,america", "Health Canada", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Refer to Health Canada. ");
	Pills dopafibra1= new Pills("DopaFibra", "N/A", "N/A", "N/A", "USA", "dopafibra,dopa,fibra,health,canada,the,lin,institute,usa,united,states,america", "Health Canada", "img/dopafibra1.jpg", "img/thumbnaildopafibra1.jpg", "Refer to Health Canada. ");
	Pills draguilars= new Pills("Dr. Aguilar's Transdermal Topical Lotion", "N/A", "N/A", "N/A", "USA", "dr,aguilars,transdermal,topical,lotion,cites,magnarx,inc,magna,rx", "CITES", "img/draguilars.jpg", "img/thumbnaildraguilars.jpg", "Refer to CITES. ");
	Pills duprostsutasteride = new Pills("Duprost Sutasteride Capsules", "N/A", "N/A", "N/A", "USA", "duprost,sutasteride,capsules,cipla,ltd,health,canada,usa,united,states,america", "Health Canada", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Refer to Health Canada. ");
	Pills elancepetitchocolat = new Pills("Elance petit chocolat", "N/A", "N/A", "N/A", "USA", "elance,petit,chocolat,cites,advanced,nutritional,supplements,usa,united,states,america", "CITES", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Refer to CITES. ");
	Pills ephedrinehcl = new Pills("Ephedrine HCL: Oral Nasal Decongestant", "N/A", "N/A", "N/A", "USA", "ephedrine,hcl,oral,nasal,decongestant,seize,advanced,nutritional,supplements,usa,united,states,america", "Seize", "img/ephedrinehcl.jpg", "img/thumbnailephedrinehcl.jpg", "Seize these pills. ");
	Pills esomi40 = new Pills("Esomi-40 Esomeprazole Tablets", "N/A", "N/A", "N/A", "USA", "esomi40,esomi,40,esomeprazole,tablets,health,canada,usa,united,states,america,zenlabs,pharmaceuticals", "Health Canada", "img/esomi40.jpg", "img/thumbnailesomi40.jpg", "Refer these pills to Health Canada. ");
	Pills faxtincapsules = new Pills("Faxtin Capsules", "N/A", "N/A", "N/A", "USA", "faxtin,capsules,seize,usa,united,states,america,ind,swift,limited", "Health Canada", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Refer these pills to Health Canada. ");
	Pills fertilaidformen = new Pills("FertilAid for Men", "N/A", "N/A", "N/A", "USA", "fertilaid,for,men,usa,united,states,america,fairhaven,health,canada", "Health Canada", "img/fertilaidformen.jpg", "img/thumbnailfertilaidformen.jpg", "Refer these pills to Health Canada. ");
	Pills focusformula = new Pills("Focus Formula", "N/A", "N/A", "N/A", "USA", "focus,formula,for,men,usa,united,states,america,native,remedies,health,canada", "Health Canada", "img/focusformula.jpg", "img/thumbnailnoimage.jpg", "Refer these pills to Health Canada. ");
	Pills frusenex100 = new Pills("Frusenex-100", "N/A", "N/A", "N/A", "USA", "frusenex100,frusenex,100,usa,united,states,america,geno,pharmaceuticals,health,canada", "Health Canada", "img/frusenex100.jpg", "img/thumbnailfrusenex100.jpg", "Refer these pills to Health Canada. ");
	Pills ghrghrenewu = new Pills("GHR GH Renew-U", "N/A", "N/A", "N/A", "USA", "ghr,gh,renew,u,renewu,usa,united,states,america,american,anti,aging,society,health,canada", "Health Canada", "img/ghrghrenewu.jpg", "img/thumbnailghrghrenewu.jpg", "Refer these pills to Health Canada. ");
	Pills krilloil = new Pills("Krill Oil", "N/A", "N/A", "N/A", "USA", "krill,oil,usa,united,states,america,rejuvenation,science,health,canada", "Health Canada", "img/krilloil.jpg", "img/thumbnailkrilloil.jpg", "Refer these pills to Health Canada. ");
	Pills lifesupplydietarysupplements = new Pills("Life Supply Dietary Supplements", "N/A", "N/A", "N/A", "USA", "life,supply,dietary,supplements,usa,united,states,america,seize", "Seize", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Seize these pills. ");
	Pills liposafe = new Pills("Lipo Safe", "N/A", "N/A", "N/A", "USA", "lipo,safe,usa,united,states,america,health,canada,certified,natural,laboratories,inc", "Health Canada", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Refer to Health Canada. ");
	Pills lipothin = new Pills("Lipo Thin", "N/A", "N/A", "N/A", "USA", "lipo,thin,usa,united,states,america,health,canada,certified,natural,laboratories,inc", "Health Canada", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Refer to Health Canada. ");
	Pills lipotrim = new Pills("Lipo Trim", "N/A", "N/A", "N/A", "USA", "lipo,trim,usa,united,states,america,health,canada,now,sports", "Health Canada", "img/lipotrim.jpg", "img/thumbnaillipotrim.jpg", "Refer to Health Canada. ");
	Pills lupihcg = new Pills("Lupi-HCG", "N/A", "N/A", "N/A", "USA", "lupi,hcg,usa,united,states,america,health,canada,lupin,ltd", "Health Canada", "img/lupihcg.jpg", "img/thumbnaillupihcg.jpg", "Refer to Health Canada. ");
	Pills magnarxplus = new Pills("Magna RX+/Magna RXTRA+", "N/A", "N/A", "N/A", "USA", "magnarxplus,magna,rx,magnarxtra,rxtra,usa,united,states,america,cites,inc", "Health Canada", "img/magnarxplus.jpg", "img/thumbnailmagnarxplus.jpg", "Refer to Health Canada. ");
	Pills manhoodmax = new Pills("Manhood Max", "N/A", "N/A", "N/A", "USA", "manhood,max,usa,united,states,america,health,canada,bionutricals,inc", "Health Canada", "img/manhoodmax.jpg", "img/thumbnailmanhoodmax.jpg", "Refer to Health Canada. ");
	Pills maximumxe = new Pills("Maximum XE", "N/A", "N/A", "N/A", "USA", "maximum,xe,usa,united,states,america,dr,bross,supreme,research,seize", "Seize", "img/maximumxe.jpg", "img/thumbnailmaximumxe.jpg", "Seize these pills. ");
	Pills mdrol = new Pills("M-Drol", "N/A", "N/A", "N/A", "USA", "m,drol,mdrol,usa,united,states,america,seize", "Seize", "img/mdrol.jpg", "img/thumbnailmdrol.jpg", "Seize these pills. ");
	Pills moodmax = new Pills("MoodMax", "N/A", "N/A", "N/A", "USA", "mood,max,usa,united,states,america,the,lin,institute,health,canada", "Health Canada", "img/moodmax.jpg", "img/thumbnailmoodmax.jpg", "Refer to Health Canada. ");
	Pills nanox9hardcore = new Pills("naNOX9 Hardcore", "N/A", "N/A", "N/A", "USA", "na,nox9,hardcore,usa,united,states,america,muscle,tech,health,canada", "Health Canada", "img/nanox9hardcore.jpg", "img/thumbnailnanox9hardcore.jpg", "Refer to Health Canada. ");

	//Added 31/08/16
	Pills orilstat100 = new Pills("Orlistat Xenical", "Blue", "No Color", "Capsule", "USA", "120mg,blue,capsule,prescription,oral,120,mg,health,canada,orilstat,xenical,usa,united,states,america", "Health Canada", "img/orlistat100.jpg", "img/orlistat250.jpg", "Refer to Health Canada. ");
	Pills penegra100 = new Pills("Penegra", "Pink", "No Color", "Other", "USA", "penegra,zydus,healthcare,sildenafil,citrate,tablets,tablet,100mg,100,mg,alidac,ed,pink,peach,diamond,blister,pack, usa,united,states,America,seize", "Health Canada", "img/penegra100.jpg", "img/penegra250.jpg", "Refer to Health Canada- a Cialis generic drug- sildenafil citrate. ");
	Pills pheraflex100 = new Pills("Pheraflex iForce Nutrition", "White", "Red", "Capsule", "USA", "17a,17,a,andosterone,deoxymethyltestosterone,deoxy,methyl,testosterone,steroid,steroids,red,white,capsule,iforce,i,force,pheraflex,nutrition, usa,united,states,america,seize", "Seize", "img/penegra100.jpg", "img/penegra250.jpg", "Should be seized under schedule IV of CDSA (anabolic steroids and their derivatives) - contains steroids, specifically deoxy-methyl-testosterone. ");
	Pills resveratrol100 = new Pills("Resveratrol Plus", "White", "Other", "Capsule", "USA", "white,cream,reservatrol,plus,capsule,usa,united,states,america,release", "Release", "img/Resveratrol100.jpg", "img/Resveratrol250.jpg", "Release to domestic. ");
	Pills rezilience100 = new Pills("Rezilience", "N/A", "N/A", "N/A", "USA", "rezilience,usa,united,states,america,release", "Release", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Release to domestic. ");
	Pills ropex100 = new Pills("Ropex", "N/A", "N/A", "N/A", "USA", "ropex,biogenica,llc,usa,united,states,america,release", "Release", "img/ropex100.jpg", "img/ropex250.jpg", "Release to domestic. ");
	Pills rippedfuel100 = new Pills("Ripped Fuel", "N/A", "N/A", "N/A", "USA", "ripped,fuel,twinlab,usa,united,states,america,release", "Release", "img/rippedfuel100.jpg", "img/rippedfuel250.jpg", "Release to domestic. ");
	Pills ru21100 = new Pills("RU 21", "N/A", "N/A", "N/A", "USA", "ru,21,spirit,sciences,inc,usa,united,states,america,release", "Release", "img/ru21100.jpg", "img/ru21250.jpg", "Release to domestic. ");
	Pills samesadeno100 = new Pills("SAMe s-adenosyl-L-methionine", "N/A", "N/A", "N/A", "USA", "same,s,adenosyl,l,methionine,source,naturals,inc,usa,united,states,america,release", "Release", "img/samesadeno100.jpg", "img/samesadeno250.jpg", "Release to domestic. ");
	Pills methylselenocysteine= new Pills("SE-Methyl-Selenocysteine", "N/A", "N/A", "N/A", "USA", "se,methyl,selenocysteine,lifeextension,life,extension,usa,united,states,america,release", "Release", "img/methylselenocysteine100.jpg", "img/methylselenocysteine250.jpg", "Release to domestic. ");
	Pills semenax= new Pills("Semenax", "N/A", "N/A", "N/A", "USA", "semenax,leading,edge,herbals,usa,united,states,america,health,canada", "Health Canada", "img/semenax100.jpg", "img/semenax250.jpg", "Refer to Health Canada. ");
	Pills sildenafilxx= new Pills("Sildenafil", "N/A", "N/A", "N/A", "USA", "sildenafil,health,canada,usa,united,states,america,health,canada", "Health Canada", "img/sildenafilxx100.jpg", "img/sildenafilxx250.jpg", "Refer to Health Canada. ");
	Pills subduehg= new Pills("Subdue-HG", "N/A", "N/A", "N/A", "USA", "subduehg,a&m,nutrition,health,canada,usa,united,states,america", "Health Canada", "img/subduehg100.jpg", "img/subduehg250.jpg", "Refer to Health Canada. ");
	Pills sugalor= new Pills("Sugalor", "N/A", "N/A", "N/A", "USA", "sugalor,arizona,pharmaceuticals,seize,usa,united,states,america", "Seize", "img/sugalor100.jpg", "img/sugalor250.jpg", "Seize these goods, contains a controlled substance. ");
	Pills superadrenalstress= new Pills("Super Adrenal Stress Formula", "N/A", "N/A", "N/A", "USA", "super,adrenal,stress,formula,future,formulations,llc,health,canada,usa,united,states,America,doctor,wilsons", "Health Canada", "img/superadrenalstress100.jpg", "img/superadrenalstress250.jpg", "Refer to Health Canada. ");
	Pills superlq= new Pills("Super LQ", "N/A", "N/A", "N/A", "USA", "super,lq,stress,bonded,labs,health,canada,usa,united,states,america", "Health Canada", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Refer to Health Canada. ");
	Pills superpureyohimbe= new Pills("Super Pure Yohimbe", "N/A", "N/A", "N/A", "USA", "super,pure,yohimbe,health,canada,usa,united,states,america", "Health Canada", "img/superpureyohimbe100.jpg", "img/superpureyohimbe250.jpg", "Refer to Health Canada. ");
	Pills sytropin= new Pills("Sytropin", "N/A", "N/A", "N/A", "USA", "sytropin,hgh,supplements,health,canada,usa,united,states,america", "Health Canada", "img/sytropin100.jpg", "img/sytropin250.jpg", "Refer to Health Canada. ");
	Pills tadalafil= new Pills("Tadalafil", "N/A", "N/A", "N/A", "USA", "tadalafil,health,canada,usa,united,states,america", "Health Canada", "img/tadalafil100.jpg", "img/tadalafil250.jpg", "Refer to Health Canada. ");
	Pills trimethylglycine= new Pills("TMG Trimethylglycine (Anhydrous Betaine)", "N/A", "N/A", "N/A", "USA", "tmg,trimethylglycine,anhydrous,betaine,health,canada,usa,united,states,america", "Health Canada", "img/trimethylglycine100.jpg", "img/trimethylglycine250.jpg", "Refer to Health Canada. ");
	Pills ultrah3= new Pills("Ultra H-3", "N/A", "N/A", "N/A", "USA", "ultrah3,ultra,h3,unikey,health,canada,usa,united,states,america", "Health Canada", "img/ultrah3100.jpg", "img/ultrah3250.jpg", "Refer to Health Canada. ");
	Pills upyourgasenergyblaster = new Pills("Up Your Gas Energy Blaster", "N/A", "N/A", "N/A", "USA", "up,your,gas,energy,hot,stuff,nutritionals,blaster,release,usa,united,states,america", "Release", "img/upyourgasenergyblaster100.jpg", "img/upyourgasenergyblaster250.jpg", "Release to domestic. ");
	Pills viagrowth3= new Pills("ViaGrowth III", "N/A", "N/A", "N/A", "USA", "viagrowth,via,growth,iii,usa,united,states,America,seize", "Seize", "img/viagrowth3100.jpg", "img/viagrowth3250.jpg", "Contains a controlled substance, seize these goods. ");
	Pills vicerex= new Pills("Vicerex", "N/A", "N/A", "N/A", "USA", "vicerex,release,usa,united,states,america", "Seize", "img/vicerex100.jpg", "img/vicerex250.jpg", "Release to domestic. ");
	Pills vigrx= new Pills("VigRX", "N/A", "N/A", "N/A", "USA", "vigrx,leading,edge,herbals,release,usa,united,states,america", "Release", "img/vigrx100.jpg", "img/vigrx250.jpg", "Release to domestic. ");
	Pills vimax= new Pills("Vimax", "N/A", "N/A", "N/A", "USA", "vimax,pills,expert,release,usa,united,states,america", "Release", "img/vimax100.jpg", "img/vimax250.jpg", "Release to domestic. ");
	Pills vinpocetinerx= new Pills("Vinpocetine Rx", "N/A", "N/A", "N/A", "USA", "vinpocetine,rx,club,natural,inc,release,usa,united,states,america", "Release", "img/vinpocetinerx100.jpg", "img/vinpocetinerx250.jpg", "Release to domestic. ");
	Pills visioplex= new Pills("Visio Plex", "N/A", "N/A", "N/A", "USA", "visio,plex,progressive,laboratories,inc,release,usa,united,states,america", "Release", "img/visioplex100.jpg", "img/visioplex250.jpg", "Release to domestic. ");
	Pills vitacorplus= new Pills("Vitacor Plus", "N/A", "N/A", "N/A", "USA", "vitacor,plus,dr,rath,health,programs,canada,usa,united,states,america", "Health Canada", "img/vitacorplus100.jpg", "img/vitacorplus250.jpg", "Refer to Health Canada . ");
	Pills voltarenemulgel= new Pills("Voltaren Emulgel", "N/A", "N/A", "N/A", "USA", "voltaren,emulgel,novartis,consumer,health,canada,australasia,usa,united,states,america", "Health Canada", "img/voltarenemulgel100.jpg", "img/voltarenemulgel250.jpg", "Refer to Health Canada . ");
	Pills voltarenrapid25= new Pills("Voltaren Rapid 25", "N/A", "N/A", "N/A", "USA", "voltaren,rapid,25,novartis,consumer,health,canada,australasia,usa,united,states,america", "Health Canada", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Refer to Health Canada . ");
	Pills wellman1= new Pills("Wellman", "N/A", "N/A", "N/A", "USA", "wellman,vitabiotics,health,canada,usa,united,states,america", "Health Canada", "img/wellman1100.jpg", "img/wellman1250.jpg", "Refer to Health Canada . ");
	Pills xomax= new Pills("Xomax", "N/A", "N/A", "N/A", "USA", "xomax,nutritional,science,laboratories,health,canada,usa,united,states,america", "Health Canada", "img/noimage.jpg", "img/thumbnailnoimage.jpg", "Refer to Health Canada . ");
	Pills xtralean= new Pills("Xtra Lean", "N/A", "N/A", "N/A", "USA", "xtra,lean,west,pharm,seize,usa,united,states,america", "Seize", "img/xtralean100.jpg", "img/xtralean250.jpg", "Contains a controlled substance. Seize these goods. ");
	Pills zyporex= new Pills("Zyporex", "N/A", "N/A", "N/A", "USA", "zyporex,eng,llc,health,canada,usa,united,states,america", "Health Canada", "img/zyporex100.jpg", "img/zyporex250.jpg", "Refer to Health Canada. ");


	
	//TODO: Add more pills here. 
	/* ***** IMPORTANT: ADD UNDER HERE. ***** */
	
	
	/* ***** IMPORTANT: DON'T TYPE BEYOND THIS LINE.  ***** */
	
	//This initiates the array list by adding the pills to it. 
	public PillCollection(Search search, Frames frames)
	{
		this.search = search;
		this.frames = frames;
		
		pillDB.add(thiamine1);
		pillDB.add(diazepam1);
		pillDB.add(phentermine1);
		pillDB.add(diazepam2);
		pillDB.add(fluoxetine1);
		pillDB.add(propranolol1);
		pillDB.add(bisacodyl1);
		pillDB.add(hydrochlorothiazide1);
		pillDB.add(fluoxetine2);
		pillDB.add(phentermine2);
		pillDB.add(propranolol2);
		pillDB.add(diazepam3);
		pillDB.add(fluoxetine3);
		pillDB.add(pyridoxine1);
		pillDB.add(phentermine3);
		pillDB.add(diazepam4);
		pillDB.add(domperidone1);
		pillDB.add(medroxyprogesteroneacetate1);
		pillDB.add(omeprazole1);
		pillDB.add(isosorbidemononitrate1);
		pillDB.add(clopidogrel1);
		pillDB.add(trimetazidine1);
		pillDB.add(lifetransferfactorplus);
		pillDB.add(flcld);
		pillDB.add(inoneformen);
		pillDB.add(inoneforwomen);
		pillDB.add(dayfatflusher);
		pillDB.add(lifetransferfactorbellevie);
		pillDB.add(htpessential);
		pillDB.add(mthfthorne);
		
		pillDB.add(dfbx1);
		pillDB.add(keto1);
		pillDB.add(acaiclubnatural1);
		pillDB.add(acaiberrypower1);
		pillDB.add(acaiburn1);
		pillDB.add(acaiplus1);
		pillDB.add(acaiaslim1);
		pillDB.add(abmroyal1);
		pillDB.add(accelerator1);
		pillDB.add(acetyllcarnitine1);
		pillDB.add(acetylglutathione1);
		pillDB.add(acidoll1);
		pillDB.add(acs200);
		pillDB.add(acssupershot);
		pillDB.add(activotc);
		pillDB.add(activedigestiveenzymes);
		pillDB.add(acznano);
		pillDB.add(adalatretard20);
		pillDB.add(adrenacort);
		pillDB.add(adrenalcformula);

		pillDB.add(fluoxentineffffppp);
		pillDB.add(fluoxentinehydroxxkk);
		pillDB.add(bisacodylahht);
		pillDB.add(adrenalcortex);
		pillDB.add(adrenalrebuilder);
		pillDB.add(adrenaladrenolyphsym);
		pillDB.add(adrenaladrenolyphplus);
		pillDB.add(adresetadrenalfomula);
		pillDB.add(ayurdanasaldrops);
		pillDB.add(advaclear);
		pillDB.add(b100plus);
		pillDB.add(magnesiumvitamin);
		pillDB.add(banguyen);
		pillDB.add(banderol);
		pillDB.add(bcbeyondchelation);
		pillDB.add(beecaps);
		pillDB.add(beepollen);
		pillDB.add(bestresveratrol);
		pillDB.add(betacarotene);
		pillDB.add(betafood1450);
		pillDB.add(betainehcl);
		pillDB.add(bimectin);
		pillDB.add(bioactiveq);
		pillDB.add(biocardio);
		pillDB.add(brn2);
		pillDB.add(carvedilol);
		pillDB.add(cialis);
		pillDB.add(claextreme);
		pillDB.add(coenzymebcomplex);
		pillDB.add(anoretix);
		pillDB.add(atrophex);
		pillDB.add(dehydrone15);
		pillDB.add(deriphyllinretard300);
		pillDB.add(dhea);
		pillDB.add(dietsupport);
		pillDB.add(dopafibra1);
		pillDB.add(draguilars);
		pillDB.add(duprostsutasteride);
		pillDB.add(elancepetitchocolat);
		pillDB.add(ephedrinehcl);
		pillDB.add(esomi40);
		pillDB.add(faxtincapsules);
		pillDB.add(fertilaidformen);
		pillDB.add(focusformula);
		pillDB.add(frusenex100);
		pillDB.add(ghrghrenewu);
		pillDB.add(krilloil);
		pillDB.add(lifesupplydietarysupplements);
		pillDB.add(liposafe);
		pillDB.add(lipothin);
		pillDB.add(lipothin);
		pillDB.add(lupihcg);
		pillDB.add(magnarxplus);
		pillDB.add(maximumxe);
		pillDB.add(mdrol);
		pillDB.add(moodmax);
		pillDB.add(nanox9hardcore);
		
		pillDB.add(orilstat100);
		pillDB.add(penegra100);
		pillDB.add(pheraflex100);
		pillDB.add(resveratrol100);
		pillDB.add(rezilience100);
		pillDB.add(ropex100);
		pillDB.add(rippedfuel100);
		pillDB.add(ru21100);
		pillDB.add(samesadeno100);
		pillDB.add(methylselenocysteine);
		pillDB.add(semenax);
		pillDB.add(sildenafilxx);
		pillDB.add(subduehg);
		pillDB.add(sugalor);
		pillDB.add(superadrenalstress);
		pillDB.add(superlq);
		pillDB.add(superpureyohimbe);
		pillDB.add(sytropin);
		pillDB.add(tadalafil);
		pillDB.add(trimethylglycine);
		pillDB.add(ultrah3);
		pillDB.add(upyourgasenergyblaster);
		pillDB.add(viagrowth3);
		pillDB.add(vicerex);
		pillDB.add(vigrx);
		pillDB.add(vimax);
		pillDB.add(vinpocetinerx);
		pillDB.add(visioplex);
		pillDB.add(vitacorplus);
		pillDB.add(voltarenemulgel);
		pillDB.add(voltarenrapid25);
		pillDB.add(wellman1);
		pillDB.add(xomax);
		pillDB.add(xtralean);
		pillDB.add(zyporex);
		
		//TODO: Add more pills here. 
		/* ***** IMPORTANT: ADD UNDER HERE, BEFORE THE BRACKET. ***** */
		
		
		/* ***** IMPORTANT: DON'T TYPE BEYOND THIS LINE.  ***** */
	}
	
	//Return p1 - p2 if need to do ascending order. Currently descending order so it displays largest relevant numbers first. 
	public void sortRelevance()
	{
		Collections.sort(pillDB, new Comparator<Pills>()
			{
				@Override public int compare(Pills p1, Pills p2)
				{
					return p2.getRelevance() - p1.getRelevance();
				}
			});
	}
}
