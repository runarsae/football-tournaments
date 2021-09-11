/**
 */
package ft.impl;

import ft.Club;
import ft.FtPackage;
import ft.Match;
import ft.Result;
import ft.ResultKind;
import ft.Round;
import ft.Statistic;
import ft.Table;
import ft.WinnerKind;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList.UnmodifiableEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Statistic</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ft.impl.StatisticImpl#getClub <em>Club</em>}</li>
 *   <li>{@link ft.impl.StatisticImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link ft.impl.StatisticImpl#getPlayed <em>Played</em>}</li>
 *   <li>{@link ft.impl.StatisticImpl#getWon <em>Won</em>}</li>
 *   <li>{@link ft.impl.StatisticImpl#getDrawn <em>Drawn</em>}</li>
 *   <li>{@link ft.impl.StatisticImpl#getLost <em>Lost</em>}</li>
 *   <li>{@link ft.impl.StatisticImpl#getGoalsFor <em>Goals For</em>}</li>
 *   <li>{@link ft.impl.StatisticImpl#getGoalsAgainst <em>Goals Against</em>}</li>
 *   <li>{@link ft.impl.StatisticImpl#getGoalDifference <em>Goal Difference</em>}</li>
 *   <li>{@link ft.impl.StatisticImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link ft.impl.StatisticImpl#getForm <em>Form</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatisticImpl extends MinimalEObjectImpl.Container implements Statistic {
	/**
	 * The cached value of the '{@link #getClub() <em>Club</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getClub()
	 * @generated
	 * @ordered
	 */
	protected Club club;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final int POSITION_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getPlayed() <em>Played</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPlayed()
	 * @generated
	 * @ordered
	 */
	protected static final int PLAYED_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getWon() <em>Won</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWon()
	 * @generated
	 * @ordered
	 */
	protected static final int WON_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getDrawn() <em>Drawn</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDrawn()
	 * @generated
	 * @ordered
	 */
	protected static final int DRAWN_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getLost() <em>Lost</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLost()
	 * @generated
	 * @ordered
	 */
	protected static final int LOST_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getGoalsFor() <em>Goals For</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGoalsFor()
	 * @generated
	 * @ordered
	 */
	protected static final int GOALS_FOR_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getGoalsAgainst() <em>Goals Against</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGoalsAgainst()
	 * @generated
	 * @ordered
	 */
	protected static final int GOALS_AGAINST_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getGoalDifference() <em>Goal Difference</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGoalDifference()
	 * @generated
	 * @ordered
	 */
	protected static final int GOAL_DIFFERENCE_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int POINTS_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected StatisticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtPackage.Literals.STATISTIC;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Club getClub() {
		if (club != null && club.eIsProxy()) {
			InternalEObject oldClub = (InternalEObject)club;
			club = (Club)eResolveProxy(oldClub);
			if (club != oldClub) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FtPackage.STATISTIC__CLUB, oldClub, club));
			}
		}
		return club;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Club basicGetClub() {
		return club;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setClub(Club newClub) {
		Club oldClub = club;
		club = newClub;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtPackage.STATISTIC__CLUB, oldClub, club));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getPosition() {
		AtomicInteger position = new AtomicInteger(1);

		int points = this.getPoints();
		int goalDifference = this.getGoalDifference();
		int goalsFor = this.getGoalsFor();
		
		// Loop through all statistics in the table
		for (Statistic statistic : ((Table) this.eContainer()).getStatistics()) {
			int otherPoints = statistic.getPoints();

			if (points < otherPoints) {
				// If this statistic's points is less than the other statistic, 
				// increment the position on the table
				position.getAndIncrement();
			} else if (points == otherPoints) {
				// If points are equal, check goal difference
				int otherGoalDifference = statistic.getGoalDifference();

				if (goalDifference < otherGoalDifference) {
					// If this statistic's goal difference is less than the other statistic, 
					// increment the position on the table
					position.getAndIncrement();
				} else if (goalDifference == otherGoalDifference) {
					// If goal difference is equal, check goals for
					int otherGoalsFor = statistic.getGoalsFor();

					if (goalsFor < otherGoalsFor) {
						// If this statistic's goals for is less than the other statistic, 
						// increment the position on the table
						position.getAndIncrement();
					}
				}
			}
		}

		return position.get();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getPlayed() {
		AtomicInteger counter = new AtomicInteger(0);
		
		// Count all matches the club has played this stage
		for (Round round : ((Table) this.eContainer()).getStage().getRounds()) {
			for (Match match : round.getMatches()) {
				if (match.getResult() != null) {
					if (match.getHomeClub() == this.club || match.getAwayClub() == this.club) {
						counter.getAndIncrement();
					}
				}
			}
		}

		return counter.get();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getWon() {
		AtomicInteger counter = new AtomicInteger(0);

		// Go through all matches for the club in this stage and count number of wins
		for (Round round : ((Table) this.eContainer()).getStage().getRounds()) {
			for (Match match : round.getMatches()) {
				if (match.getResult() != null) {
					if ((match.getHomeClub() == this.club && match.getResult().getWinner() == WinnerKind.HOME)
							|| (match.getAwayClub() == this.club && match.getResult().getWinner() == WinnerKind.AWAY)) {
						counter.getAndIncrement();
					}
				}
			}
		}

		return counter.get();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getDrawn() {
		AtomicInteger counter = new AtomicInteger(0);

		// Go through all matches for the club in this stage and count number of draws
		for (Round round : ((Table) this.eContainer()).getStage().getRounds()) {
			for (Match match : round.getMatches()) {
				if (match.getResult() != null) {
					if ((match.getHomeClub() == this.club || match.getAwayClub() == this.club)
							&& match.getResult().getWinner() == WinnerKind.DRAW) {
						counter.getAndIncrement();
					}
				}
			}
		}

		return counter.get();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getLost() {
		AtomicInteger counter = new AtomicInteger(0);
		
		// Go through all matches for the club in this stage and count number of losses
		for (Round round : ((Table) this.eContainer()).getStage().getRounds()) {
			for (Match match : round.getMatches()) {
				if (match.getResult() != null) {
					if ((match.getHomeClub() == this.club && match.getResult().getWinner() == WinnerKind.AWAY)
							|| (match.getAwayClub() == this.club && match.getResult().getWinner() == WinnerKind.HOME)) {
						counter.getAndIncrement();
					}
				}
			}
		}

		return counter.get();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getGoalsFor() {
		AtomicInteger counter = new AtomicInteger(0);

		// Go through all matches for the club in this stage and count goals scored for
		for (Round round : ((Table) this.eContainer()).getStage().getRounds()) {
			for (Match match : round.getMatches()) {
				if (match.getResult() != null) {
					if (match.getHomeClub() == this.club) {
						counter.getAndAdd(((Result) match.getResult()).getHomeGoalsFullTime());
					} else if (match.getAwayClub() == this.club) {
						counter.getAndAdd(((Result) match.getResult()).getAwayGoalsFullTime());
					}
				}
			}
		}

		return counter.get();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getGoalsAgainst() {
		AtomicInteger counter = new AtomicInteger(0);
		
		// Go through all matches for the club in this stage and count goals scored against
		for (Round round : ((Table) this.eContainer()).getStage().getRounds()) {
			for (Match match : round.getMatches()) {
				if (match.getResult() != null) {
					if (match.getHomeClub() == this.club) {
						counter.getAndAdd(((Result) match.getResult()).getAwayGoalsFullTime());
					} else if (match.getAwayClub() == this.club) {
						counter.getAndAdd(((Result) match.getResult()).getHomeGoalsFullTime());
					}
				}
			}
		}

		return counter.get();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getGoalDifference() {
		// Total goal difference is goals scored this stage minus goals scored against
		return this.getGoalsFor() - this.getGoalsAgainst();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int getPoints() {
		// Calculate total points where win = 3 points and draw = 1 point
		return (this.getWon() * 3) + this.getDrawn();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<ResultKind> getForm() {
		List<Match> matches = new ArrayList<Match>();
		
		// Get all played matches for this club in the stage
		for (Round round : ((Table) this.eContainer()).getStage().getRounds()) {
			for (Match match : round.getMatches()) {
				if ((match.getHomeClub() == this.club || match.getAwayClub() == this.club) && match.getResult() != null) {
					matches.add(match);
				}
			}
		}
		
		// Sort matches according to date
		Collections.sort(matches, new Comparator<Match>() {
			  public int compare(Match x, Match y) {
				    return x.getDate().isBefore(y.getDate()) ? -1 : x.getDate().isAfter(y.getDate()) ? 1 : 0;
			  }
		});
		
		// Get the last 6 matches (maximum)
		if (matches.size() > 6) {
			matches = matches.subList(matches.size() - 6, matches.size());
		}
		
		// Generate a ResultKind for each match based on the winner
		ResultKind[] form = new ResultKind[matches.size()];
		
		for (int i = 0; i < matches.size(); i++) {
			WinnerKind winner = matches.get(i).getResult().getWinner();
			
			if ((winner == WinnerKind.HOME && matches.get(i).getHomeClub() == this.club) || (winner == WinnerKind.AWAY && matches.get(i).getAwayClub() == this.club)) {
				form[i] = ResultKind.WIN;
			} else if (winner == WinnerKind.DRAW) {
				form[i] = ResultKind.DRAW;
			} else {
				form[i] = ResultKind.LOSS;
			}
		}
				
		return new UnmodifiableEList<ResultKind>(matches.size(), form);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FtPackage.STATISTIC__CLUB:
				if (resolve) return getClub();
				return basicGetClub();
			case FtPackage.STATISTIC__POSITION:
				return getPosition();
			case FtPackage.STATISTIC__PLAYED:
				return getPlayed();
			case FtPackage.STATISTIC__WON:
				return getWon();
			case FtPackage.STATISTIC__DRAWN:
				return getDrawn();
			case FtPackage.STATISTIC__LOST:
				return getLost();
			case FtPackage.STATISTIC__GOALS_FOR:
				return getGoalsFor();
			case FtPackage.STATISTIC__GOALS_AGAINST:
				return getGoalsAgainst();
			case FtPackage.STATISTIC__GOAL_DIFFERENCE:
				return getGoalDifference();
			case FtPackage.STATISTIC__POINTS:
				return getPoints();
			case FtPackage.STATISTIC__FORM:
				return getForm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FtPackage.STATISTIC__CLUB:
				setClub((Club)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FtPackage.STATISTIC__CLUB:
				setClub((Club)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FtPackage.STATISTIC__CLUB:
				return club != null;
			case FtPackage.STATISTIC__POSITION:
				return getPosition() != POSITION_EDEFAULT;
			case FtPackage.STATISTIC__PLAYED:
				return getPlayed() != PLAYED_EDEFAULT;
			case FtPackage.STATISTIC__WON:
				return getWon() != WON_EDEFAULT;
			case FtPackage.STATISTIC__DRAWN:
				return getDrawn() != DRAWN_EDEFAULT;
			case FtPackage.STATISTIC__LOST:
				return getLost() != LOST_EDEFAULT;
			case FtPackage.STATISTIC__GOALS_FOR:
				return getGoalsFor() != GOALS_FOR_EDEFAULT;
			case FtPackage.STATISTIC__GOALS_AGAINST:
				return getGoalsAgainst() != GOALS_AGAINST_EDEFAULT;
			case FtPackage.STATISTIC__GOAL_DIFFERENCE:
				return getGoalDifference() != GOAL_DIFFERENCE_EDEFAULT;
			case FtPackage.STATISTIC__POINTS:
				return getPoints() != POINTS_EDEFAULT;
			case FtPackage.STATISTIC__FORM:
				return !getForm().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // StatisticImpl
