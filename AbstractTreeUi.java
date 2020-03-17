package com.intellij.ide.util.treeView;

import com.intellij.ide.IdeBundle;
import com.intellij.ide.UiActivity;
import com.intellij.ide.UiActivityMonitor;
import com.intellij.ide.UiActivity.AsyncBgOperation;
import com.intellij.ide.util.treeView.AbstractTreeBuilder.UserRunnable;
import com.intellij.ide.util.treeView.AbstractTreeUi.1;
import com.intellij.ide.util.treeView.AbstractTreeUi.10;
import com.intellij.ide.util.treeView.AbstractTreeUi.11;
import com.intellij.ide.util.treeView.AbstractTreeUi.12;
import com.intellij.ide.util.treeView.AbstractTreeUi.13;
import com.intellij.ide.util.treeView.AbstractTreeUi.14;
import com.intellij.ide.util.treeView.AbstractTreeUi.15;
import com.intellij.ide.util.treeView.AbstractTreeUi.16;
import com.intellij.ide.util.treeView.AbstractTreeUi.17;
import com.intellij.ide.util.treeView.AbstractTreeUi.18;
import com.intellij.ide.util.treeView.AbstractTreeUi.19;
import com.intellij.ide.util.treeView.AbstractTreeUi.2;
import com.intellij.ide.util.treeView.AbstractTreeUi.20;
import com.intellij.ide.util.treeView.AbstractTreeUi.21;
import com.intellij.ide.util.treeView.AbstractTreeUi.22;
import com.intellij.ide.util.treeView.AbstractTreeUi.23;
import com.intellij.ide.util.treeView.AbstractTreeUi.24;
import com.intellij.ide.util.treeView.AbstractTreeUi.25;
import com.intellij.ide.util.treeView.AbstractTreeUi.26;
import com.intellij.ide.util.treeView.AbstractTreeUi.27;
import com.intellij.ide.util.treeView.AbstractTreeUi.28;
import com.intellij.ide.util.treeView.AbstractTreeUi.29;
import com.intellij.ide.util.treeView.AbstractTreeUi.3;
import com.intellij.ide.util.treeView.AbstractTreeUi.30;
import com.intellij.ide.util.treeView.AbstractTreeUi.31;
import com.intellij.ide.util.treeView.AbstractTreeUi.32;
import com.intellij.ide.util.treeView.AbstractTreeUi.33;
import com.intellij.ide.util.treeView.AbstractTreeUi.34;
import com.intellij.ide.util.treeView.AbstractTreeUi.35;
import com.intellij.ide.util.treeView.AbstractTreeUi.36;
import com.intellij.ide.util.treeView.AbstractTreeUi.37;
import com.intellij.ide.util.treeView.AbstractTreeUi.38;
import com.intellij.ide.util.treeView.AbstractTreeUi.39;
import com.intellij.ide.util.treeView.AbstractTreeUi.4;
import com.intellij.ide.util.treeView.AbstractTreeUi.40;
import com.intellij.ide.util.treeView.AbstractTreeUi.41;
import com.intellij.ide.util.treeView.AbstractTreeUi.42;
import com.intellij.ide.util.treeView.AbstractTreeUi.43;
import com.intellij.ide.util.treeView.AbstractTreeUi.44;
import com.intellij.ide.util.treeView.AbstractTreeUi.45;
import com.intellij.ide.util.treeView.AbstractTreeUi.46;
import com.intellij.ide.util.treeView.AbstractTreeUi.47;
import com.intellij.ide.util.treeView.AbstractTreeUi.48;
import com.intellij.ide.util.treeView.AbstractTreeUi.49;
import com.intellij.ide.util.treeView.AbstractTreeUi.5;
import com.intellij.ide.util.treeView.AbstractTreeUi.50;
import com.intellij.ide.util.treeView.AbstractTreeUi.51;
import com.intellij.ide.util.treeView.AbstractTreeUi.52;
import com.intellij.ide.util.treeView.AbstractTreeUi.53;
import com.intellij.ide.util.treeView.AbstractTreeUi.54;
import com.intellij.ide.util.treeView.AbstractTreeUi.55;
import com.intellij.ide.util.treeView.AbstractTreeUi.56;
import com.intellij.ide.util.treeView.AbstractTreeUi.57;
import com.intellij.ide.util.treeView.AbstractTreeUi.58;
import com.intellij.ide.util.treeView.AbstractTreeUi.59;
import com.intellij.ide.util.treeView.AbstractTreeUi.6;
import com.intellij.ide.util.treeView.AbstractTreeUi.60;
import com.intellij.ide.util.treeView.AbstractTreeUi.61;
import com.intellij.ide.util.treeView.AbstractTreeUi.62;
import com.intellij.ide.util.treeView.AbstractTreeUi.63;
import com.intellij.ide.util.treeView.AbstractTreeUi.64;
import com.intellij.ide.util.treeView.AbstractTreeUi.65;
import com.intellij.ide.util.treeView.AbstractTreeUi.66;
import com.intellij.ide.util.treeView.AbstractTreeUi.67;
import com.intellij.ide.util.treeView.AbstractTreeUi.68;
import com.intellij.ide.util.treeView.AbstractTreeUi.69;
import com.intellij.ide.util.treeView.AbstractTreeUi.7;
import com.intellij.ide.util.treeView.AbstractTreeUi.70;
import com.intellij.ide.util.treeView.AbstractTreeUi.71;
import com.intellij.ide.util.treeView.AbstractTreeUi.8;
import com.intellij.ide.util.treeView.AbstractTreeUi.9;
import com.intellij.ide.util.treeView.NodeDescriptor.NodeComparator;
import com.intellij.ide.util.treeView.TreeRunnable.TreeConsumer;
import com.intellij.openapi.application.Application;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.progress.EmptyProgressIndicator;
import com.intellij.openapi.progress.ProcessCanceledException;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Progressive;
import com.intellij.openapi.project.IndexNotReadyException;
import com.intellij.openapi.util.ActionCallback;
import com.intellij.openapi.util.AsyncResult;
import com.intellij.openapi.util.Comparing;
import com.intellij.openapi.util.Computable;
import com.intellij.openapi.util.Condition;
import com.intellij.openapi.util.Conditions;
import com.intellij.openapi.util.Disposer;
import com.intellij.openapi.util.EmptyRunnable;
import com.intellij.openapi.util.MutualMap;
import com.intellij.openapi.util.Pair;
import com.intellij.openapi.util.Ref;
import com.intellij.openapi.util.SimpleTimer;
import com.intellij.openapi.util.SimpleTimerTask;
import com.intellij.openapi.util.ActionCallback.Chunk;
import com.intellij.openapi.util.BusyObject.Impl;
import com.intellij.openapi.util.registry.Registry;
import com.intellij.openapi.util.registry.RegistryValue;
import com.intellij.ui.LoadingNode;
import com.intellij.ui.treeStructure.AlwaysExpandedTree;
import com.intellij.ui.treeStructure.Tree;
import com.intellij.util.Alarm;
import com.intellij.util.ArrayUtil;
import com.intellij.util.ArrayUtilRt;
import com.intellij.util.ObjectUtils;
import com.intellij.util.SmartList;
import com.intellij.util.TimeoutUtil;
import com.intellij.util.concurrency.LockToken;
import com.intellij.util.concurrency.QueueProcessor;
import com.intellij.util.containers.ContainerUtil;
import com.intellij.util.ui.UIUtil;
import com.intellij.util.ui.tree.TreeUtil;
import com.intellij.util.ui.update.UiNotifyConnector;
import gnu.trove.THashSet;
import java.awt.Rectangle;
import java.awt.event.FocusAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Supplier;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeExpansionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.ApiStatus.ScheduledForRemoval;
import org.jetbrains.concurrency.AsyncPromise;
import org.jetbrains.concurrency.Promise;
import org.jetbrains.concurrency.Promises;
import org.jetbrains.concurrency.Promise.State;

/** @deprecated */
@Deprecated
@ScheduledForRemoval(
   inVersion = "2020.3"
)
public class AbstractTreeUi {
   private static final Logger LOG = Logger.getInstance("#com.intellij.ide.util.treeView.AbstractTreeBuilder");
   protected JTree myTree;
   private DefaultTreeModel myTreeModel;
   private AbstractTreeStructure myTreeStructure;
   private AbstractTreeUpdater myUpdater;
   private Comparator<? super NodeDescriptor> myNodeDescriptorComparator;
   private final Comparator<TreeNode> myNodeComparator = new 1(this);
   long myOwnComparatorStamp;
   private long myLastComparatorStamp;
   private DefaultMutableTreeNode myRootNode;
   private final Map<Object, Object> myElementToNodeMap = new HashMap();
   private final Set<DefaultMutableTreeNode> myUnbuiltNodes = new HashSet();
   private TreeExpansionListener myExpansionListener;
   private com.intellij.ide.util.treeView.AbstractTreeUi.MySelectionListener mySelectionListener;
   private final QueueProcessor<Runnable> myWorker = new QueueProcessor((runnable) -> {
      runnable.run();
      TimeoutUtil.sleep(1L);
   });
   private final Set<Runnable> myActiveWorkerTasks = new HashSet();
   private ProgressIndicator myProgress;
   private AbstractTreeNode<Object> TREE_NODE_WRAPPER;
   private boolean myRootNodeWasQueuedToInitialize;
   private boolean myRootNodeInitialized;
   private final Map<Object, List<com.intellij.ide.util.treeView.AbstractTreeUi.NodeAction>> myNodeActions = new HashMap();
   private boolean myUpdateFromRootRequested;
   private boolean myWasEverShown;
   private boolean myUpdateIfInactive;
   private final Map<Object, com.intellij.ide.util.treeView.AbstractTreeUi.UpdateInfo> myLoadedInBackground = new HashMap();
   private final Map<Object, List<com.intellij.ide.util.treeView.AbstractTreeUi.NodeAction>> myNodeChildrenActions = new HashMap();
   private long myClearOnHideDelay = -1L;
   private volatile long ourUi2Countdown;
   private final Set<Runnable> myDeferredSelections = new HashSet();
   private final Set<Runnable> myDeferredExpansions = new HashSet();
   private boolean myCanProcessDeferredSelections;
   private UpdaterTreeState myUpdaterState;
   private AbstractTreeBuilder myBuilder;
   private final Set<DefaultMutableTreeNode> myUpdatingChildren = new THashSet();
   private boolean myCanYield;
   private final List<TreeUpdatePass> myYieldingPasses = new ArrayList();
   private boolean myYieldingNow;
   private final Set<DefaultMutableTreeNode> myPendingNodeActions = new HashSet();
   private final Set<Runnable> myYieldingDoneRunnables = new HashSet();
   private final Alarm myBusyAlarm = new Alarm();
   private final Runnable myWaiterForReady = new 2(this, "AbstractTreeUi.myWaiterForReady");
   private final RegistryValue myYieldingUpdate = Registry.get("ide.tree.yieldingUiUpdate");
   private final RegistryValue myShowBusyIndicator = Registry.get("ide.tree.showBusyIndicator");
   private final RegistryValue myWaitForReadyTime = Registry.get("ide.tree.waitForReadyTimeout");
   private boolean myWasEverIndexNotReady;
   private boolean myShowing;
   private final FocusAdapter myFocusListener = new 3(this);
   private final Set<DefaultMutableTreeNode> myNotForSmartExpand = new HashSet();
   private TreePath myRequestedExpand;
   private TreePath mySilentExpand;
   private TreePath mySilentSelect;
   private final ActionCallback myInitialized = new ActionCallback();
   private final Impl myBusyObject = new 4(this);
   private boolean myPassThroughMode;
   private final Set<Object> myAutoExpandRoots = new HashSet();
   private final RegistryValue myAutoExpandDepth = Registry.get("ide.tree.autoExpandMaxDepth");
   private final Set<DefaultMutableTreeNode> myWillBeExpanded = new HashSet();
   private SimpleTimerTask myCleanupTask;
   private final AtomicBoolean myCancelRequest = new AtomicBoolean();
   private final ReentrantLock myStateLock = new ReentrantLock();
   private final AtomicBoolean myResettingToReadyNow = new AtomicBoolean();
   private final Map<Progressive, ProgressIndicator> myBatchIndicators = new HashMap();
   private final Map<Progressive, ActionCallback> myBatchCallbacks = new HashMap();
   private final Map<DefaultMutableTreeNode, DefaultMutableTreeNode> myCancelledBuild = new WeakHashMap();
   private boolean mySelectionIsAdjusted;
   private boolean myReleaseRequested;
   private boolean mySelectionIsBeingAdjusted;
   private final Set<Object> myRevalidatedObjects = new HashSet();
   private final Set<Runnable> myUserRunnables = new HashSet();
   private UiActivityMonitor myActivityMonitor;
   @NonNls
   private UiActivity myActivityId;

   public String toString() {
      return "AbstractTreeUi: builder = " + this.myBuilder;
   }

   protected void init(@NotNull AbstractTreeBuilder builder, @NotNull JTree tree, @NotNull DefaultTreeModel treeModel, AbstractTreeStructure treeStructure, @Nullable Comparator<? super NodeDescriptor> comparator, boolean updateIfInactive) {
      if (builder == null) {
         $$$reportNull$$$0(0);
      }

      if (tree == null) {
         $$$reportNull$$$0(1);
      }

      if (treeModel == null) {
         $$$reportNull$$$0(2);
      }

      this.myBuilder = builder;
      this.myTree = tree;
      this.myTreeModel = treeModel;
      this.myActivityMonitor = UiActivityMonitor.getInstance();
      this.myActivityId = new AsyncBgOperation("TreeUi " + this);
      this.addModelListenerToDiagnoseAccessOutsideEdt();
      this.TREE_NODE_WRAPPER = AbstractTreeBuilder.createSearchingTreeNodeWrapper();
      this.myTree.setModel(this.myTreeModel);
      this.setRootNode((DefaultMutableTreeNode)treeModel.getRoot());
      this.myTreeStructure = treeStructure;
      this.myNodeDescriptorComparator = comparator;
      this.myUpdateIfInactive = updateIfInactive;
      UIUtil.invokeLaterIfNeeded(new 5(this, "AbstractTreeUi.init"));
      this.myExpansionListener = new com.intellij.ide.util.treeView.AbstractTreeUi.MyExpansionListener(this, (1)null);
      this.myTree.addTreeExpansionListener(this.myExpansionListener);
      this.mySelectionListener = new com.intellij.ide.util.treeView.AbstractTreeUi.MySelectionListener(this, (1)null);
      this.myTree.addTreeSelectionListener(this.mySelectionListener);
      this.setUpdater(this.getBuilder().createUpdater());
      this.myProgress = this.getBuilder().createProgressIndicator();
      Disposer.register(this.getBuilder(), this.getUpdater());
      if (this.myProgress != null) {
         Disposer.register(this.getBuilder(), () -> {
            this.myProgress.cancel();
         });
      }

      UiNotifyConnector uiNotify = new UiNotifyConnector(tree, new 6(this));
      Disposer.register(this.getBuilder(), uiNotify);
      this.myTree.addFocusListener(this.myFocusListener);
   }

   private boolean isNodeActionsPending() {
      return !this.myNodeActions.isEmpty() || !this.myNodeChildrenActions.isEmpty();
   }

   private void clearNodeActions() {
      this.myNodeActions.clear();
      this.myNodeChildrenActions.clear();
   }

   private void maybeSetBusyAndScheduleWaiterForReady(boolean forcedBusy, @Nullable Object element) {
      if (this.myShowBusyIndicator.asBoolean()) {
         boolean canUpdateBusyState = false;
         if (forcedBusy) {
            if (this.canYield() || this.isToBuildChildrenInBackground(element)) {
               canUpdateBusyState = true;
            }
         } else {
            canUpdateBusyState = true;
         }

         if (canUpdateBusyState) {
            if (this.myTree instanceof Tree) {
               Tree tree = (Tree)this.myTree;
               boolean isBusy = !this.isReady(true) || forcedBusy;
               if (isBusy && tree.isShowing()) {
                  tree.setPaintBusy(true);
                  this.myBusyAlarm.cancelAllRequests();
                  this.myBusyAlarm.addRequest(this.myWaiterForReady, this.myWaitForReadyTime.asInteger());
               } else {
                  tree.setPaintBusy(false);
               }
            }

         }
      }
   }

   private void setHoldSize(boolean holdSize) {
      if (this.myTree instanceof Tree) {
         Tree tree = (Tree)this.myTree;
         tree.setHoldSize(holdSize);
      }

   }

   private void cleanUpAll() {
      long now = System.currentTimeMillis();
      long timeToCleanup = this.ourUi2Countdown;
      if (timeToCleanup != 0L && now >= timeToCleanup) {
         this.ourUi2Countdown = 0L;
         Runnable runnable = new 7(this, "AbstractTreeUi.cleanUpAll");
         if (this.isPassthroughMode()) {
            runnable.run();
         } else {
            this.invokeLaterIfNeeded(false, runnable);
         }
      }

   }

   void doCleanUp() {
      Runnable cleanup = new 8(this, "AbstractTreeUi.doCleanUp");
      if (this.isPassthroughMode()) {
         cleanup.run();
      } else {
         this.invokeLaterIfNeeded(false, cleanup);
      }

   }

   void invokeLaterIfNeeded(boolean forceEdt, @NotNull Runnable runnable) {
      if (runnable == null) {
         $$$reportNull$$$0(3);
      }

      Runnable actual = new 9(this, "AbstractTreeUi.invokeLaterIfNeeded", runnable);
      if (!this.isPassthroughMode() && (forceEdt || isEdt() || this.isTreeShowing() || this.myWasEverShown)) {
         UIUtil.invokeLaterIfNeeded(actual);
      } else {
         actual.run();
      }

   }

   public void activate(boolean byShowing) {
      this.cancelCurrentCleanupTask();
      this.myCanProcessDeferredSelections = true;
      this.ourUi2Countdown = 0L;
      if (!this.myWasEverShown || this.myUpdateFromRootRequested || this.myUpdateIfInactive) {
         this.getBuilder().updateFromRoot();
      }

      this.getUpdater().showNotify();
      this.myWasEverShown |= byShowing;
   }

   private void cancelCurrentCleanupTask() {
      if (this.myCleanupTask != null) {
         this.myCleanupTask.cancel();
         this.myCleanupTask = null;
      }

   }

   void deactivate() {
      this.getUpdater().hideNotify();
      this.myBusyAlarm.cancelAllRequests();
      if (this.myWasEverShown) {
         if (this.myProgress != null && this.myProgress.isRunning()) {
            this.myProgress.cancel();
         }

         if (!this.isReady()) {
            this.cancelUpdate();
            this.myUpdateFromRootRequested = true;
         }

         if (this.getClearOnHideDelay() >= 0L) {
            this.ourUi2Countdown = System.currentTimeMillis() + this.getClearOnHideDelay();
            this.scheduleCleanUpAll();
         }

      }
   }

   private void scheduleCleanUpAll() {
      this.cancelCurrentCleanupTask();
      this.myCleanupTask = SimpleTimer.getInstance().setUp(new 10(this, "AbstractTreeUi.scheduleCleanUpAll"), this.getClearOnHideDelay());
   }

   void requestRelease() {
      this.myReleaseRequested = true;
      this.cancelUpdate().doWhenDone(new 11(this, "AbstractTreeUi.requestRelease: on done"));
   }

   public ProgressIndicator getProgress() {
      return this.myProgress;
   }

   private void releaseNow() {
      LockToken ignored = this.acquireLock();
      Throwable var2 = null;

      try {
         this.myTree.removeTreeExpansionListener(this.myExpansionListener);
         this.myTree.removeTreeSelectionListener(this.mySelectionListener);
         this.myTree.removeFocusListener(this.myFocusListener);
         this.disposeNode(this.getRootNode());
         this.myElementToNodeMap.clear();
         this.getUpdater().cancelAllRequests();
         this.myWorker.clear();
         this.clearWorkerTasks();
         this.TREE_NODE_WRAPPER.setValue((Object)null);
         if (this.myProgress != null) {
            this.myProgress.cancel();
         }

         this.cancelCurrentCleanupTask();
         this.myTree = null;
         this.setUpdater((AbstractTreeUpdater)null);
         this.myTreeStructure = null;
         this.myBuilder.releaseUi();
         this.myBuilder = null;
         this.clearNodeActions();
         this.myDeferredSelections.clear();
         this.myDeferredExpansions.clear();
         this.myYieldingDoneRunnables.clear();
      } catch (Throwable var11) {
         var2 = var11;
         throw var11;
      } finally {
         if (ignored != null) {
            if (var2 != null) {
               try {
                  ignored.close();
               } catch (Throwable var10) {
                  var2.addSuppressed(var10);
               }
            } else {
               ignored.close();
            }
         }

      }

   }

   public boolean isReleased() {
      return this.myBuilder == null;
   }

   void doExpandNodeChildren(@NotNull DefaultMutableTreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(4);
      }

      if (this.myUnbuiltNodes.contains(node)) {
         if (!this.isLoadedInBackground(this.getElementFor(node))) {
            AbstractTreeStructure structure = this.getTreeStructure();
            structure.asyncCommit().doWhenDone(new 12(this, "AbstractTreeUi.doExpandNodeChildren", node));
         }
      }
   }

   public final AbstractTreeStructure getTreeStructure() {
      return this.myTreeStructure;
   }

   public final JTree getTree() {
      return this.myTree;
   }

   @Nullable
   private static NodeDescriptor getDescriptorFrom(Object node) {
      if (node instanceof DefaultMutableTreeNode) {
         Object userObject = ((DefaultMutableTreeNode)node).getUserObject();
         if (userObject instanceof NodeDescriptor) {
            return (NodeDescriptor)userObject;
         }
      }

      return null;
   }

   @Nullable
   public final DefaultMutableTreeNode getNodeForElement(@NotNull Object element, boolean validateAgainstStructure) {
      if (element == null) {
         $$$reportNull$$$0(5);
      }

      DefaultMutableTreeNode result = null;
      if (validateAgainstStructure) {
         int index = 0;

         while(true) {
            DefaultMutableTreeNode node = this.findNode(element, index);
            if (node == null) {
               break;
            }

            if (this.isNodeValidForElement(element, node)) {
               result = node;
               break;
            }

            ++index;
         }
      } else {
         result = this.getFirstNode(element);
      }

      if (result != null && !this.isNodeInStructure(result)) {
         this.disposeNode(result);
         result = null;
      }

      return result;
   }

   private boolean isNodeInStructure(@NotNull DefaultMutableTreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(6);
      }

      return TreeUtil.isAncestor(this.getRootNode(), node) && this.getRootNode() == this.myTreeModel.getRoot();
   }

   private boolean isNodeValidForElement(@NotNull Object element, @NotNull DefaultMutableTreeNode node) {
      if (element == null) {
         $$$reportNull$$$0(7);
      }

      if (node == null) {
         $$$reportNull$$$0(8);
      }

      return this.isSameHierarchy(element, node) || this.isValidChildOfParent(element, node);
   }

   private boolean isValidChildOfParent(@NotNull Object element, @NotNull DefaultMutableTreeNode node) {
      if (element == null) {
         $$$reportNull$$$0(9);
      }

      if (node == null) {
         $$$reportNull$$$0(10);
      }

      DefaultMutableTreeNode parent = (DefaultMutableTreeNode)node.getParent();
      Object parentElement = this.getElementFor(parent);
      if (!this.isInStructure(parentElement)) {
         return false;
      } else if (parent instanceof com.intellij.ide.util.treeView.AbstractTreeUi.ElementNode) {
         return ((com.intellij.ide.util.treeView.AbstractTreeUi.ElementNode)parent).isValidChild(element);
      } else {
         for(int i = 0; i < parent.getChildCount(); ++i) {
            TreeNode child = parent.getChildAt(i);
            Object eachElement = this.getElementFor(child);
            if (element.equals(eachElement)) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean isSameHierarchy(@NotNull Object element, @NotNull DefaultMutableTreeNode node) {
      if (element == null) {
         $$$reportNull$$$0(11);
      }

      if (node == null) {
         $$$reportNull$$$0(12);
      }

      Object eachParent = element;
      DefaultMutableTreeNode eachParentNode = node;

      boolean valid;
      while(true) {
         if (eachParent == null) {
            valid = eachParentNode == null;
            break;
         }

         if (!eachParent.equals(this.getElementFor(eachParentNode))) {
            valid = false;
            break;
         }

         eachParent = this.getTreeStructure().getParentElement(eachParent);
         eachParentNode = (DefaultMutableTreeNode)eachParentNode.getParent();
      }

      return valid;
   }

   @Nullable
   public final DefaultMutableTreeNode getNodeForPath(@NotNull Object[] path) {
      if (path == null) {
         $$$reportNull$$$0(13);
      }

      DefaultMutableTreeNode node = null;
      Object[] var3 = path;
      int var4 = path.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         Object pathElement = var3[var5];
         node = node == null ? this.getFirstNode(pathElement) : this.findNodeForChildElement(node, pathElement);
         if (node == null) {
            break;
         }
      }

      return node;
   }

   final void buildNodeForElement(@NotNull Object element) {
      if (element == null) {
         $$$reportNull$$$0(14);
      }

      this.getUpdater().performUpdate();
      DefaultMutableTreeNode node = this.getNodeForElement(element, false);
      if (node == null) {
         ArrayList elements = new ArrayList();

         while(true) {
            element = this.getTreeStructure().getParentElement(element);
            if (element == null) {
               Iterator var4 = elements.iterator();

               while(var4.hasNext()) {
                  Object element1 = var4.next();
                  node = this.getNodeForElement(element1, false);
                  if (node != null) {
                     this.expand(node, true);
                  }
               }
               break;
            }

            elements.add(0, element);
         }
      }

   }

   public final void buildNodeForPath(@NotNull Object[] path) {
      if (path == null) {
         $$$reportNull$$$0(15);
      }

      this.getUpdater().performUpdate();
      DefaultMutableTreeNode node = null;
      Object[] var3 = path;
      int var4 = path.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         Object pathElement = var3[var5];
         node = node == null ? this.getFirstNode(pathElement) : this.findNodeForChildElement(node, pathElement);
         if (node != null && node != path[path.length - 1]) {
            this.expand(node, true);
         }
      }

   }

   public final void setNodeDescriptorComparator(Comparator<? super NodeDescriptor> nodeDescriptorComparator) {
      this.myNodeDescriptorComparator = nodeDescriptorComparator;
      this.myLastComparatorStamp = -1L;
      this.getBuilder().queueUpdateFrom(this.getTreeStructure().getRootElement(), true);
   }

   @NotNull
   protected AbstractTreeBuilder getBuilder() {
      AbstractTreeBuilder var10000 = this.myBuilder;
      if (var10000 == null) {
         $$$reportNull$$$0(16);
      }

      return var10000;
   }

   protected final void initRootNode() {
      if (this.myUpdateIfInactive) {
         this.activate(false);
      } else {
         this.myUpdateFromRootRequested = true;
      }

   }

   private boolean initRootNodeNowIfNeeded(@NotNull TreeUpdatePass pass) {
      if (pass == null) {
         $$$reportNull$$$0(17);
      }

      boolean wasCleanedUp = false;
      Object root;
      if (this.myRootNodeWasQueuedToInitialize) {
         root = this.getTreeStructure().getRootElement();

         assert root != null : "Root element cannot be null";

         Object currentRoot = this.getElementFor(this.myRootNode);
         if (Comparing.equal(root, currentRoot)) {
            return false;
         }

         Object rootAgain = this.getTreeStructure().getRootElement();

         assert root == rootAgain || root.equals(rootAgain) : "getRootElement() if called twice must return either root1 == root2 or root1.equals(root2)";

         this.cleanUpNow();
         wasCleanedUp = true;
      }

      if (this.myRootNodeWasQueuedToInitialize) {
         return true;
      } else {
         this.myRootNodeWasQueuedToInitialize = true;
         root = this.getTreeStructure().getRootElement();
         this.addNodeAction(root, false, (node) -> {
            this.processDeferredActions();
         });
         Ref<NodeDescriptor> rootDescriptor = new Ref((Object)null);
         boolean bgLoading = this.isToBuildChildrenInBackground(root);
         Runnable build = new 13(this, "AbstractTreeUi.initRootNodeNowIfNeeded: build", rootDescriptor, root, pass);
         Runnable update = new 14(this, "AbstractTreeUi.initRootNodeNowIfNeeded: update", rootDescriptor, pass);
         if (bgLoading) {
            this.queueToBackground(build, update).onSuccess(new 15(this, "AbstractTreeUi.initRootNodeNowIfNeeded: on processed queueToBackground"));
         } else {
            build.run();
            update.run();
            this.myRootNodeInitialized = true;
            this.processNodeActionsIfReady(this.myRootNode);
         }

         return wasCleanedUp;
      }
   }

   private boolean isAutoExpand(@NotNull NodeDescriptor descriptor) {
      if (descriptor == null) {
         $$$reportNull$$$0(18);
      }

      return this.isAutoExpand(descriptor, true);
   }

   private boolean isAutoExpand(@NotNull NodeDescriptor descriptor, boolean validate) {
      if (descriptor == null) {
         $$$reportNull$$$0(19);
      }

      if (this.isAlwaysExpandedTree()) {
         return false;
      } else {
         boolean autoExpand = this.getBuilder().isAutoExpandNode(descriptor);
         Object element = this.getElementFromDescriptor(descriptor);
         if (validate && element != null) {
            autoExpand = this.validateAutoExpand(autoExpand, element);
         }

         return !autoExpand && !this.myTree.isRootVisible() && element != null && element.equals(this.getTreeStructure().getRootElement()) ? true : autoExpand;
      }
   }

   private boolean validateAutoExpand(boolean autoExpand, @NotNull Object element) {
      if (element == null) {
         $$$reportNull$$$0(20);
      }

      if (autoExpand) {
         int distance = this.getDistanceToAutoExpandRoot(element);
         if (distance < 0) {
            this.myAutoExpandRoots.add(element);
         } else if (distance >= this.myAutoExpandDepth.asInteger() - 1) {
            autoExpand = false;
         }

         if (autoExpand) {
            DefaultMutableTreeNode node = this.getNodeForElement(element, false);
            autoExpand = node != null && this.isInVisibleAutoExpandChain(node);
         }
      }

      return autoExpand;
   }

   private boolean isInVisibleAutoExpandChain(@NotNull DefaultMutableTreeNode child) {
      if (child == null) {
         $$$reportNull$$$0(21);
      }

      for(Object eachParent = child; eachParent != null; eachParent = ((TreeNode)eachParent).getParent()) {
         if (this.myRootNode == eachParent) {
            return true;
         }

         NodeDescriptor eachDescriptor = getDescriptorFrom(eachParent);
         if (eachDescriptor == null || !this.isAutoExpand(eachDescriptor, false)) {
            TreePath path = getPathFor((TreeNode)eachParent);
            return this.myWillBeExpanded.contains(path.getLastPathComponent()) || this.myTree.isExpanded(path) && this.myTree.isVisible(path);
         }
      }

      return false;
   }

   private int getDistanceToAutoExpandRoot(@NotNull Object element) {
      if (element == null) {
         $$$reportNull$$$0(22);
      }

      int distance = 0;

      Object eachParent;
      for(eachParent = element; eachParent != null && !this.myAutoExpandRoots.contains(eachParent); ++distance) {
         eachParent = this.getTreeStructure().getParentElement(eachParent);
      }

      return eachParent != null ? distance : -1;
   }

   private boolean isAutoExpand(@NotNull DefaultMutableTreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(23);
      }

      NodeDescriptor descriptor = getDescriptorFrom(node);
      return descriptor != null && this.isAutoExpand(descriptor);
   }

   private boolean isAlwaysExpandedTree() {
      return this.myTree instanceof AlwaysExpandedTree && ((AlwaysExpandedTree)this.myTree).isAlwaysExpanded();
   }

   @NotNull
   private Promise<Boolean> update(@NotNull NodeDescriptor nodeDescriptor, boolean now) {
      if (nodeDescriptor == null) {
         $$$reportNull$$$0(24);
      }

      Object promise;
      if (!now && !this.isPassthroughMode()) {
         AsyncPromise<Boolean> result = new AsyncPromise();
         promise = result;
         boolean bgLoading = this.isToBuildInBackground(nodeDescriptor);
         boolean edt = isEdt();
         if (bgLoading) {
            if (edt) {
               AtomicBoolean changes = new AtomicBoolean();
               this.queueToBackground(new 16(this, "AbstractTreeUi.update: build", changes, nodeDescriptor), new 17(this, "AbstractTreeUi.update: post", result, changes));
            } else {
               result.setResult(this.update(nodeDescriptor));
            }
         } else if (!edt && this.myWasEverShown) {
            this.invokeLaterIfNeeded(false, new 18(this, "AbstractTreeUi.update: later", result, nodeDescriptor));
         } else {
            result.setResult(this.update(nodeDescriptor));
         }
      } else {
         promise = Promises.resolvedPromise(this.update(nodeDescriptor));
      }

      ((Promise)promise).onSuccess((changesx) -> {
         if (changesx) {
            this.invokeLaterIfNeeded(false, new 19(this, "AbstractTreeUi.update: on done result", nodeDescriptor));
         }
      });
      if (promise == null) {
         $$$reportNull$$$0(25);
      }

      return (Promise)promise;
   }

   private boolean update(@NotNull NodeDescriptor nodeDescriptor) {
      if (nodeDescriptor == null) {
         $$$reportNull$$$0(26);
      }

      while(true) {
         try {
            LockToken ignored = this.attemptLock();
            Throwable var3 = null;

            boolean var5;
            try {
               if (ignored == null) {
                  if (this.myProgress != null && this.myProgress.isRunning()) {
                     this.myProgress.cancel();
                  }
                  continue;
               }

               AtomicBoolean update = new AtomicBoolean();
               this.execute((Runnable)(new 20(this, "AbstractTreeUi.update", nodeDescriptor, update)));
               var5 = update.get();
            } catch (Throwable var17) {
               var3 = var17;
               throw var17;
            } finally {
               if (ignored != null) {
                  if (var3 != null) {
                     try {
                        ignored.close();
                     } catch (Throwable var16) {
                        var3.addSuppressed(var16);
                     }
                  } else {
                     ignored.close();
                  }
               }

            }

            return var5;
         } catch (IndexNotReadyException var19) {
            this.warnOnIndexNotReady(var19);
            return false;
         } catch (InterruptedException var20) {
            LOG.info(var20);
            return false;
         }
      }
   }

   public void assertIsDispatchThread() {
      if (!this.isPassthroughMode()) {
         if ((this.isTreeShowing() || this.myWasEverShown) && !isEdt()) {
            LOG.error("Must be in event-dispatch thread");
         }

      }
   }

   private static boolean isEdt() {
      return SwingUtilities.isEventDispatchThread();
   }

   private boolean isTreeShowing() {
      return this.myShowing;
   }

   private void assertNotDispatchThread() {
      if (!this.isPassthroughMode()) {
         if (isEdt()) {
            LOG.error("Must not be in event-dispatch thread");
         }

      }
   }

   private void processDeferredActions() {
      processDeferredActions(this.myDeferredSelections);
      processDeferredActions(this.myDeferredExpansions);
   }

   private static void processDeferredActions(@NotNull Set<Runnable> actions) {
      if (actions == null) {
         $$$reportNull$$$0(27);
      }

      Runnable[] runnables = (Runnable[])actions.toArray(new Runnable[0]);
      actions.clear();
      Runnable[] var2 = runnables;
      int var3 = runnables.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         Runnable runnable = var2[var4];
         runnable.run();
      }

   }

   @NotNull
   public ActionCallback queueUpdate(Object element) {
      ActionCallback var10000 = this.queueUpdate(element, true);
      if (var10000 == null) {
         $$$reportNull$$$0(28);
      }

      return var10000;
   }

   @NotNull
   public ActionCallback queueUpdate(Object fromElement, boolean updateStructure) {
      this.assertIsDispatchThread();

      ActionCallback var10000;
      label55: {
         try {
            if (this.getUpdater() == null) {
               var10000 = ActionCallback.REJECTED;
               break label55;
            }

            ActionCallback result = new ActionCallback();
            DefaultMutableTreeNode nodeToUpdate = null;
            boolean updateElementStructure = updateStructure;

            for(Object element = fromElement; element != null; element = this.getTreeStructure().getParentElement(element)) {
               DefaultMutableTreeNode node = this.getFirstNode(element);
               if (node != null) {
                  nodeToUpdate = node;
                  break;
               }

               updateElementStructure = true;
            }

            this.addSubtreeToUpdate(nodeToUpdate != null ? nodeToUpdate : this.getRootNode(), new 21(this, "AbstractTreeUi.queueUpdate", result), updateElementStructure);
            var10000 = result;
         } catch (ProcessCanceledException var8) {
            var10000 = ActionCallback.REJECTED;
            if (var10000 == null) {
               $$$reportNull$$$0(31);
            }

            return var10000;
         }

         if (var10000 == null) {
            $$$reportNull$$$0(30);
         }

         return var10000;
      }

      if (var10000 == null) {
         $$$reportNull$$$0(29);
      }

      return var10000;
   }

   public void doUpdateFromRoot() {
      this.updateSubtree(this.getRootNode(), false);
   }

   public final void updateSubtree(@NotNull DefaultMutableTreeNode node, boolean canSmartExpand) {
      if (node == null) {
         $$$reportNull$$$0(32);
      }

      this.updateSubtree(new TreeUpdatePass(node), canSmartExpand);
   }

   private void updateSubtree(@NotNull TreeUpdatePass pass, boolean canSmartExpand) {
      if (pass == null) {
         $$$reportNull$$$0(33);
      }

      AbstractTreeUpdater updater = this.getUpdater();
      if (updater != null) {
         updater.addSubtreeToUpdate(pass);
      } else {
         this.updateSubtreeNow(pass, canSmartExpand);
      }

   }

   final void updateSubtreeNow(@NotNull TreeUpdatePass pass, boolean canSmartExpand) {
      if (pass == null) {
         $$$reportNull$$$0(34);
      }

      this.maybeSetBusyAndScheduleWaiterForReady(true, this.getElementFor(pass.getNode()));
      this.setHoldSize(true);
      boolean consumed = this.initRootNodeNowIfNeeded(pass);
      if (!consumed) {
         DefaultMutableTreeNode node = pass.getNode();
         NodeDescriptor descriptor = getDescriptorFrom(node);
         if (descriptor != null) {
            if (pass.isUpdateStructure()) {
               this.setUpdaterState(new UpdaterTreeState(this)).beforeSubtreeUpdate();
               boolean forceUpdate = true;
               TreePath path = getPathFor(node);
               boolean invisible = !this.myTree.isExpanded(path) && (path.getParentPath() == null || !this.myTree.isExpanded(path.getParentPath()));
               if (invisible && this.myUnbuiltNodes.contains(node)) {
                  forceUpdate = false;
               }

               this.updateNodeChildren(node, pass, (com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren)null, false, canSmartExpand, forceUpdate, false, pass.isUpdateChildren());
            } else {
               this.updateRow(0, pass);
            }

         }
      }
   }

   private void updateRow(int row, @NotNull TreeUpdatePass pass) {
      if (pass == null) {
         $$$reportNull$$$0(35);
      }

      LOG.debug("updateRow: ", new Object[]{row, " - ", pass});
      this.invokeLaterIfNeeded(false, new 22(this, "AbstractTreeUi.updateRow", row, pass));
   }

   boolean isToBuildChildrenInBackground(Object element) {
      AbstractTreeStructure structure = this.getTreeStructure();
      return element != null && structure.isToBuildChildrenInBackground(element);
   }

   private boolean isToBuildInBackground(NodeDescriptor descriptor) {
      return this.isToBuildChildrenInBackground(this.getElementFromDescriptor(descriptor));
   }

   @NotNull
   private UpdaterTreeState setUpdaterState(@NotNull UpdaterTreeState state) {
      if (state == null) {
         $$$reportNull$$$0(36);
      }

      if (state.equals(this.myUpdaterState)) {
         if (state == null) {
            $$$reportNull$$$0(37);
         }

         return state;
      } else {
         UpdaterTreeState oldState = this.myUpdaterState;
         if (oldState == null) {
            this.myUpdaterState = state;
            if (state == null) {
               $$$reportNull$$$0(38);
            }

            return state;
         } else {
            oldState.addAll(state);
            if (oldState == null) {
               $$$reportNull$$$0(39);
            }

            return oldState;
         }
      }
   }

   void doUpdateNode(@NotNull DefaultMutableTreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(40);
      }

      NodeDescriptor descriptor = getDescriptorFrom(node);
      if (descriptor != null) {
         Object prevElement = this.getElementFromDescriptor(descriptor);
         if (prevElement != null) {
            this.update(descriptor, false).onSuccess((changes) -> {
               if (!this.isValid(descriptor) && this.isInStructure(prevElement)) {
                  Object toUpdate = ObjectUtils.notNull(this.getTreeStructure().getParentElement(prevElement), this.getTreeStructure().getRootElement());
                  this.getUpdater().addSubtreeToUpdateByElement(toUpdate);
               } else {
                  if (changes) {
                     this.updateNodeImageAndPosition(node);
                  }

               }
            });
         }
      }
   }

   public Object getElementFromDescriptor(NodeDescriptor descriptor) {
      return this.getBuilder().getTreeStructureElement(descriptor);
   }

   @NotNull
   private ActionCallback updateNodeChildren(@NotNull DefaultMutableTreeNode node, @NotNull TreeUpdatePass pass, @Nullable com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren loadedChildren, boolean forcedNow, boolean toSmartExpand, boolean forceUpdate, boolean descriptorIsUpToDate, boolean updateChildren) {
      if (node == null) {
         $$$reportNull$$$0(41);
      }

      if (pass == null) {
         $$$reportNull$$$0(42);
      }

      AbstractTreeStructure treeStructure = this.getTreeStructure();
      ActionCallback result = treeStructure.asyncCommit();
      result.doWhenDone(new 23(this, "AbstractTreeUi.updateNodeChildren: on done", node, pass, loadedChildren, forcedNow, toSmartExpand, forceUpdate, descriptorIsUpToDate, updateChildren));
      if (result == null) {
         $$$reportNull$$$0(43);
      }

      return result;
   }

   private void doUpdateChildren(@NotNull DefaultMutableTreeNode node, @NotNull TreeUpdatePass pass, @Nullable com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren loadedChildren, boolean forcedNow, boolean toSmartExpand, boolean forceUpdate, boolean descriptorIsUpToDate, boolean updateChildren) {
      if (node == null) {
         $$$reportNull$$$0(44);
      }

      if (pass == null) {
         $$$reportNull$$$0(45);
      }

      try {
         NodeDescriptor descriptor = getDescriptorFrom(node);
         if (descriptor == null) {
            this.removeFromUnbuilt(node);
            this.removeLoading(node, true);
         } else {
            boolean descriptorIsReady = descriptorIsUpToDate || pass.isUpdated(descriptor);
            boolean wasExpanded = this.myTree.isExpanded(new TreePath(node.getPath())) || this.isAutoExpand(node);
            boolean wasLeaf = node.getChildCount() == 0;
            boolean bgBuild = this.isToBuildInBackground(descriptor);
            boolean requiredToUpdateChildren = forcedNow || wasExpanded;
            if (!requiredToUpdateChildren && forceUpdate) {
               boolean alwaysPlus = this.getBuilder().isAlwaysShowPlus(descriptor);
               if (alwaysPlus && wasLeaf) {
                  requiredToUpdateChildren = true;
               } else {
                  requiredToUpdateChildren = !alwaysPlus;
                  if (!requiredToUpdateChildren && !this.myUnbuiltNodes.contains(node)) {
                     this.removeChildren(node);
                  }
               }
            }

            AtomicReference<com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren> preloaded = new AtomicReference(loadedChildren);
            if (!requiredToUpdateChildren) {
               if (this.myUnbuiltNodes.contains(node) && node.getChildCount() == 0) {
                  this.insertLoadingNode(node, true);
               }

               if (!descriptorIsReady) {
                  this.update(descriptor, false);
               }

            } else {
               if (!forcedNow && !bgBuild && this.myUnbuiltNodes.contains(node)) {
                  if (!descriptorIsReady) {
                     this.update(descriptor, true);
                     descriptorIsReady = true;
                  }

                  if (this.processAlwaysLeaf(node) || !updateChildren) {
                     return;
                  }

                  Pair<Boolean, com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren> unbuilt = this.processUnbuilt(node, descriptor, pass, wasExpanded, (com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren)null);
                  if ((Boolean)unbuilt.getFirst()) {
                     return;
                  }

                  preloaded.set(unbuilt.getSecond());
               }

               boolean childForceUpdate = this.isChildNodeForceUpdate(node, forceUpdate, wasExpanded);
               if (!forcedNow && this.isToBuildInBackground(descriptor)) {
                  boolean alwaysLeaf = this.processAlwaysLeaf(node);
                  this.queueBackgroundUpdate(new com.intellij.ide.util.treeView.AbstractTreeUi.UpdateInfo(descriptor, pass, this.canSmartExpand(node, toSmartExpand), wasExpanded, childForceUpdate, descriptorIsReady, !alwaysLeaf && updateChildren), node);
               } else {
                  if (!descriptorIsReady) {
                     this.update(descriptor, false).onSuccess(new 24(this, "AbstractTreeUi.doUpdateChildren", node, updateChildren, pass, preloaded, toSmartExpand, wasExpanded, childForceUpdate));
                  } else {
                     if (this.processAlwaysLeaf(node) || !updateChildren) {
                        return;
                     }

                     this.updateNodeChildrenNow(node, pass, (com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren)preloaded.get(), toSmartExpand, wasExpanded, childForceUpdate);
                  }

               }
            }
         }
      } finally {
         if (!this.isReleased()) {
            this.processNodeActionsIfReady(node);
         }

      }
   }

   private boolean processAlwaysLeaf(@NotNull DefaultMutableTreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(46);
      }

      Object element = this.getElementFor(node);
      NodeDescriptor desc = getDescriptorFrom(node);
      if (desc == null) {
         return false;
      } else if (element != null && this.getTreeStructure().isAlwaysLeaf(element)) {
         this.removeFromUnbuilt(node);
         this.removeLoading(node, true);
         if (node.getChildCount() > 0) {
            TreeNode[] children = new TreeNode[node.getChildCount()];

            for(int i = 0; i < node.getChildCount(); ++i) {
               children[i] = node.getChildAt(i);
            }

            if (this.isSelectionInside(node)) {
               this.addSelectionPath(getPathFor(node), true, Conditions.alwaysTrue(), (Object)null);
            }

            this.processInnerChange(new 25(this, "AbstractTreeUi.processAlwaysLeaf", children));
         }

         this.removeFromUnbuilt(node);
         desc.setWasDeclaredAlwaysLeaf(true);
         this.processNodeActionsIfReady(node);
         return true;
      } else {
         boolean wasLeaf = desc.isWasDeclaredAlwaysLeaf();
         desc.setWasDeclaredAlwaysLeaf(false);
         if (wasLeaf) {
            this.insertLoadingNode(node, true);
         }

         return false;
      }
   }

   private boolean isChildNodeForceUpdate(@NotNull DefaultMutableTreeNode node, boolean parentForceUpdate, boolean parentExpanded) {
      if (node == null) {
         $$$reportNull$$$0(47);
      }

      TreePath path = getPathFor(node);
      return parentForceUpdate && (parentExpanded || this.myTree.isExpanded(path));
   }

   private void updateNodeChildrenNow(@NotNull DefaultMutableTreeNode node, @NotNull TreeUpdatePass pass, @Nullable com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren preloadedChildren, boolean toSmartExpand, boolean wasExpanded, boolean forceUpdate) {
      if (node == null) {
         $$$reportNull$$$0(48);
      }

      if (pass == null) {
         $$$reportNull$$$0(49);
      }

      if (!this.isUpdatingChildrenNow(node)) {
         if (!this.canInitiateNewActivity()) {
            throw new ProcessCanceledException();
         } else {
            NodeDescriptor descriptor = getDescriptorFrom(node);
            MutualMap<Object, Integer> elementToIndexMap = this.loadElementsFromStructure(descriptor, preloadedChildren);
            com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren loadedChildren = preloadedChildren != null ? preloadedChildren : new com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren(elementToIndexMap.getKeys().toArray());
            this.addToUpdatingChildren(node);
            pass.setCurrentNode(node);
            boolean canSmartExpand = this.canSmartExpand(node, toSmartExpand);
            this.removeFromUnbuilt(node);
            this.processExistingNodes(node, elementToIndexMap, pass, this.canSmartExpand(node, toSmartExpand), forceUpdate, wasExpanded, preloadedChildren).onSuccess(new 27(this, "AbstractTreeUi.updateNodeChildrenNow: on done processExistingNodes", node, wasExpanded, descriptor, elementToIndexMap, loadedChildren, pass, canSmartExpand, forceUpdate)).onError(new 26(this, "AbstractTreeUi.updateNodeChildrenNow: on reject processExistingNodes", node));
         }
      }
   }

   private boolean isDisposed(@NotNull DefaultMutableTreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(50);
      }

      return !node.isNodeAncestor((DefaultMutableTreeNode)this.myTree.getModel().getRoot());
   }

   private void expandSilently(TreePath path) {
      this.assertIsDispatchThread();

      try {
         this.mySilentExpand = path;
         this.getTree().expandPath(path);
      } finally {
         this.mySilentExpand = null;
      }

   }

   private void addSelectionSilently(TreePath path) {
      this.assertIsDispatchThread();

      try {
         this.mySilentSelect = path;
         this.getTree().getSelectionModel().addSelectionPath(path);
      } finally {
         this.mySilentSelect = null;
      }

   }

   private void expand(@NotNull DefaultMutableTreeNode node, boolean canSmartExpand) {
      if (node == null) {
         $$$reportNull$$$0(51);
      }

      this.expand(new TreePath(node.getPath()), canSmartExpand);
   }

   private void expand(@NotNull TreePath path, boolean canSmartExpand) {
      if (path == null) {
         $$$reportNull$$$0(52);
      }

      Object last = path.getLastPathComponent();
      boolean isLeaf = this.myTree.getModel().isLeaf(path.getLastPathComponent());
      boolean isRoot = last == this.myTree.getModel().getRoot();
      TreePath parent = path.getParentPath();
      if (isRoot && !this.myTree.isExpanded(path)) {
         if (this.myTree.isRootVisible() || this.myUnbuiltNodes.contains(last)) {
            this.insertLoadingNode((DefaultMutableTreeNode)last, false);
         }

         this.expandPath(path, canSmartExpand);
      } else if (this.myTree.isExpanded(path) || isLeaf && parent != null && this.myTree.isExpanded(parent) && !this.myUnbuiltNodes.contains(last) && !this.isCancelled(last)) {
         if (last instanceof DefaultMutableTreeNode) {
            this.processNodeActionsIfReady((DefaultMutableTreeNode)last);
         }
      } else if (!isLeaf || !this.myUnbuiltNodes.contains(last) && !this.isCancelled(last)) {
         if (isLeaf && parent != null) {
            DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode)parent.getLastPathComponent();
            if (parentNode != null) {
               this.addToUnbuilt(parentNode);
            }

            this.expandPath(parent, canSmartExpand);
         } else {
            this.expandPath(path, canSmartExpand);
         }
      } else {
         this.insertLoadingNode((DefaultMutableTreeNode)last, true);
         this.expandPath(path, canSmartExpand);
      }

   }

   private void addToUnbuilt(DefaultMutableTreeNode node) {
      this.myUnbuiltNodes.add(node);
   }

   private void removeFromUnbuilt(DefaultMutableTreeNode node) {
      this.myUnbuiltNodes.remove(node);
   }

   private Pair<Boolean, com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren> processUnbuilt(@NotNull DefaultMutableTreeNode node, NodeDescriptor descriptor, @NotNull TreeUpdatePass pass, boolean isExpanded, @Nullable com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren loadedChildren) {
      if (node == null) {
         $$$reportNull$$$0(53);
      }

      if (pass == null) {
         $$$reportNull$$$0(54);
      }

      Ref<Pair<Boolean, com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren>> result = new Ref();
      this.execute((Runnable)(new 28(this, "AbstractTreeUi.processUnbuilt", isExpanded, descriptor, result, node, loadedChildren, pass)));
      return (Pair)result.get();
   }

   private boolean removeIfLoading(@NotNull TreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(55);
      }

      if (isLoadingNode(node)) {
         this.moveSelectionToParentIfNeeded(node);
         this.removeNodeFromParent((MutableTreeNode)node, false);
         return true;
      } else {
         return false;
      }
   }

   private void moveSelectionToParentIfNeeded(@NotNull TreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(56);
      }

      TreePath path = getPathFor(node);
      if (this.myTree.getSelectionModel().isPathSelected(path)) {
         TreePath parentPath = path.getParentPath();
         this.myTree.getSelectionModel().removeSelectionPath(path);
         if (parentPath != null) {
            this.myTree.getSelectionModel().addSelectionPath(parentPath);
         }
      }

   }

   private Object[] getChildrenFor(Object element) {
      Ref passOne = new Ref();

      try {
         LockToken ignored = this.acquireLock();
         Throwable var4 = null;

         try {
            this.execute((Runnable)(new 29(this, "AbstractTreeUi.getChildrenFor", passOne, element)));
         } catch (Throwable var15) {
            var4 = var15;
            throw var15;
         } finally {
            if (ignored != null) {
               if (var4 != null) {
                  try {
                     ignored.close();
                  } catch (Throwable var14) {
                     var4.addSuppressed(var14);
                  }
               } else {
                  ignored.close();
               }
            }

         }
      } catch (IndexNotReadyException var17) {
         this.warnOnIndexNotReady(var17);
         return ArrayUtilRt.EMPTY_OBJECT_ARRAY;
      }

      if (!Registry.is("ide.tree.checkStructure")) {
         return (Object[])passOne.get();
      } else {
         Object[] passTwo = this.getTreeStructure().getChildElements(element);
         Set<Object> two = ContainerUtil.set(passTwo);
         if (((Object[])passOne.get()).length != passTwo.length) {
            LOG.error("AbstractTreeStructure.getChildren() must either provide same objects or new objects but with correct hashCode() and equals() methods. Wrong parent element=" + element);
         } else {
            Object[] var5 = (Object[])passOne.get();
            int var6 = var5.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               Object eachInOne = var5[var7];
               if (!two.contains(eachInOne)) {
                  LOG.error("AbstractTreeStructure.getChildren() must either provide same objects or new objects but with correct hashCode() and equals() methods. Wrong parent element=" + element);
                  break;
               }
            }
         }

         return (Object[])passOne.get();
      }
   }

   private void warnOnIndexNotReady(IndexNotReadyException e) {
      if (!this.myWasEverIndexNotReady) {
         this.myWasEverIndexNotReady = true;
         LOG.error("Tree is not dumb-mode-aware; treeBuilder=" + this.getBuilder() + " treeStructure=" + this.getTreeStructure(), e);
      }

   }

   @NotNull
   private ActionCallback updateNodesToInsert(@NotNull List<? extends TreeNode> nodesToInsert, @NotNull TreeUpdatePass pass, boolean canSmartExpand, boolean forceUpdate) {
      if (nodesToInsert == null) {
         $$$reportNull$$$0(57);
      }

      if (pass == null) {
         $$$reportNull$$$0(58);
      }

      Chunk chunk = new Chunk();
      Iterator var6 = nodesToInsert.iterator();

      while(var6.hasNext()) {
         TreeNode node = (TreeNode)var6.next();
         DefaultMutableTreeNode childNode = (DefaultMutableTreeNode)node;
         ActionCallback callback = this.updateNodeChildren(childNode, pass, (com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren)null, false, canSmartExpand, forceUpdate, true, true);
         if (!callback.isDone()) {
            chunk.add(callback);
         }
      }

      ActionCallback var10000 = chunk.getWhenProcessed();
      if (var10000 == null) {
         $$$reportNull$$$0(59);
      }

      return var10000;
   }

   @NotNull
   private Promise<?> processExistingNodes(@NotNull DefaultMutableTreeNode node, @NotNull MutualMap<Object, Integer> elementToIndexMap, @NotNull TreeUpdatePass pass, boolean canSmartExpand, boolean forceUpdate, boolean wasExpanded, @Nullable com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren preloaded) {
      if (node == null) {
         $$$reportNull$$$0(60);
      }

      if (elementToIndexMap == null) {
         $$$reportNull$$$0(61);
      }

      if (pass == null) {
         $$$reportNull$$$0(62);
      }

      List<TreeNode> childNodes = TreeUtil.listChildren(node);
      return this.maybeYield(() -> {
         if (pass.isExpired()) {
            return Promises.rejectedPromise();
         } else if (childNodes.isEmpty()) {
            return Promises.resolvedPromise();
         } else {
            List<Promise<?>> promises = new SmartList();
            Iterator var10 = childNodes.iterator();

            while(true) {
               DefaultMutableTreeNode eachChild;
               do {
                  if (!var10.hasNext()) {
                     return Promises.all(promises);
                  }

                  TreeNode each = (TreeNode)var10.next();
                  eachChild = (DefaultMutableTreeNode)each;
               } while(isLoadingNode(eachChild));

               boolean childForceUpdate = this.isChildNodeForceUpdate(eachChild, forceUpdate, wasExpanded);
               promises.add(this.maybeYield(() -> {
                  NodeDescriptor descriptor = preloaded != null ? preloaded.getDescriptor(this.getElementFor(eachChild)) : null;
                  NodeDescriptor descriptorFromNode = getDescriptorFrom(eachChild);
                  if (this.isValid(descriptor)) {
                     eachChild.setUserObject(descriptor);
                     if (descriptorFromNode != null) {
                        descriptor.setChildrenSortingStamp(descriptorFromNode.getChildrenSortingStamp());
                     }
                  } else {
                     descriptor = descriptorFromNode;
                  }

                  return this.processExistingNode(eachChild, descriptor, node, elementToIndexMap, pass, canSmartExpand, childForceUpdate, preloaded);
               }, pass, node));
               Iterator var14 = promises.iterator();

               while(var14.hasNext()) {
                  Promise<?> promise = (Promise)var14.next();
                  if (promise.getState() == State.REJECTED) {
                     return Promises.rejectedPromise();
                  }
               }
            }
         }
      }, pass, node);
   }

   private boolean isRerunNeeded(@NotNull TreeUpdatePass pass) {
      if (pass == null) {
         $$$reportNull$$$0(63);
      }

      if (!pass.isExpired() && this.canInitiateNewActivity()) {
         boolean rerunBecauseTreeIsHidden = !pass.isExpired() && !this.isTreeShowing() && this.getUpdater().isInPostponeMode();
         return rerunBecauseTreeIsHidden || this.getUpdater().isRerunNeededFor(pass);
      } else {
         return false;
      }
   }

   public static <T> T calculateYieldingToWriteAction(@NotNull Supplier<? extends T> producer) throws ProcessCanceledException {
      if (producer == null) {
         $$$reportNull$$$0(64);
      }

      if (Registry.is("ide.abstractTreeUi.BuildChildrenInBackgroundYieldingToWriteAction") && !ApplicationManager.getApplication().isDispatchThread()) {
         ProgressIndicator indicator = ProgressManager.getInstance().getProgressIndicator();
         if (indicator != null && indicator.isRunning()) {
            return producer.get();
         } else {
            Ref<T> result = new Ref();
            boolean succeeded = ProgressManager.getInstance().runInReadActionWithWriteActionPriority(() -> {
               result.set(producer.get());
            }, indicator);
            if (succeeded && (indicator == null || !indicator.isCanceled())) {
               return result.get();
            } else {
               throw new ProcessCanceledException();
            }
         }
      } else {
         return producer.get();
      }
   }

   @NotNull
   private Promise<?> maybeYield(@NotNull com.intellij.ide.util.treeView.AbstractTreeUi.AsyncRunnable processRunnable, @NotNull TreeUpdatePass pass, DefaultMutableTreeNode node) {
      if (processRunnable == null) {
         $$$reportNull$$$0(65);
      }

      if (pass == null) {
         $$$reportNull$$$0(66);
      }

      Promise var10000;
      if (this.isRerunNeeded(pass)) {
         this.getUpdater().requeue(pass);
         var10000 = Promises.rejectedPromise();
         if (var10000 == null) {
            $$$reportNull$$$0(67);
         }

         return var10000;
      } else if (this.canYield()) {
         AsyncPromise<?> result = new AsyncPromise();
         pass.setCurrentNode(node);
         boolean wasRun = this.yieldAndRun(new 30(this, "AbstractTreeUi.maybeYeild", pass, result, node, processRunnable), pass);
         if (!wasRun) {
            result.setError("rejected");
         }

         if (result == null) {
            $$$reportNull$$$0(68);
         }

         return result;
      } else {
         try {
            return this.execute(processRunnable);
         } catch (ProcessCanceledException var6) {
            pass.expire();
            this.cancelUpdate();
            var10000 = Promises.rejectedPromise();
            if (var10000 == null) {
               $$$reportNull$$$0(69);
            }

            return var10000;
         }
      }
   }

   @NotNull
   private Promise<?> execute(@NotNull com.intellij.ide.util.treeView.AbstractTreeUi.AsyncRunnable runnable) throws ProcessCanceledException {
      if (runnable == null) {
         $$$reportNull$$$0(70);
      }

      Promise var10000;
      try {
         if (!this.canInitiateNewActivity()) {
            throw new ProcessCanceledException();
         }

         Promise<?> promise = runnable.run();
         if (!this.canInitiateNewActivity()) {
            throw new ProcessCanceledException();
         }

         var10000 = promise;
      } catch (ProcessCanceledException var3) {
         if (!this.isReleased()) {
            this.setCancelRequested(true);
            this.resetToReady();
         }

         throw var3;
      }

      if (var10000 == null) {
         $$$reportNull$$$0(71);
      }

      return var10000;
   }

   private void execute(@NotNull Runnable runnable) throws ProcessCanceledException {
      if (runnable == null) {
         $$$reportNull$$$0(72);
      }

      try {
         if (!this.canInitiateNewActivity()) {
            throw new ProcessCanceledException();
         } else {
            runnable.run();
            if (!this.canInitiateNewActivity()) {
               throw new ProcessCanceledException();
            }
         }
      } catch (ProcessCanceledException var3) {
         if (!this.isReleased()) {
            this.setCancelRequested(true);
            this.resetToReady();
         }

         throw var3;
      }
   }

   private boolean canInitiateNewActivity() {
      return !this.isCancelProcessed() && !this.myReleaseRequested && !this.isReleased();
   }

   private void resetToReady() {
      if (!this.isReady()) {
         if (this.myResettingToReadyNow.get()) {
            this._getReady();
         } else {
            this.myResettingToReadyNow.set(true);
            this.invokeLaterIfNeeded(false, new 31(this, "AbstractTreeUi.resetToReady: later"));
         }
      }
   }

   @NotNull
   private ActionCallback resetToReadyNow() {
      if (this.isReleased()) {
         ActionCallback var10000 = ActionCallback.REJECTED;
         if (var10000 == null) {
            $$$reportNull$$$0(73);
         }

         return var10000;
      } else {
         this.assertIsDispatchThread();
         DefaultMutableTreeNode[] uc;
         synchronized(this.myUpdatingChildren) {
            uc = (DefaultMutableTreeNode[])this.myUpdatingChildren.toArray(new DefaultMutableTreeNode[0]);
         }

         DefaultMutableTreeNode[] var2 = uc;
         int var3 = uc.length;

         int var4;
         for(var4 = 0; var4 < var3; ++var4) {
            DefaultMutableTreeNode each = var2[var4];
            this.resetIncompleteNode(each);
         }

         Object[] bg = ArrayUtil.toObjectArray(this.myLoadedInBackground.keySet());
         Object[] var12 = bg;
         var4 = bg.length;

         for(int var14 = 0; var14 < var4; ++var14) {
            Object each = var12[var14];
            DefaultMutableTreeNode node = this.getNodeForElement(each, false);
            if (node != null) {
               this.resetIncompleteNode(node);
            }
         }

         this.myUpdaterState = null;
         this.getUpdater().reset();
         this.myYieldingNow = false;
         this.myYieldingPasses.clear();
         this.myYieldingDoneRunnables.clear();
         this.myNodeActions.clear();
         this.myNodeChildrenActions.clear();
         synchronized(this.myUpdatingChildren) {
            this.myUpdatingChildren.clear();
         }

         this.myLoadedInBackground.clear();
         this.myDeferredExpansions.clear();
         this.myDeferredSelections.clear();
         ActionCallback result = this._getReady();
         result.doWhenDone(new 32(this, "AbstractTreeUi.resetToReadyNow: on done"));
         this.maybeReady();
         if (result == null) {
            $$$reportNull$$$0(74);
         }

         return result;
      }
   }

   void addToCancelled(@NotNull DefaultMutableTreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(75);
      }

      this.myCancelledBuild.put(node, node);
   }

   private void removeFromCancelled(@NotNull DefaultMutableTreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(76);
      }

      this.myCancelledBuild.remove(node);
   }

   public boolean isCancelled(@NotNull Object node) {
      if (node == null) {
         $$$reportNull$$$0(77);
      }

      return node instanceof DefaultMutableTreeNode && this.myCancelledBuild.containsKey(node);
   }

   private void resetIncompleteNode(@NotNull DefaultMutableTreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(78);
      }

      if (!this.myReleaseRequested) {
         this.addToCancelled(node);
         if (!this.isExpanded(node, false)) {
            node.removeAllChildren();
            Object element = this.getElementFor(node);
            if (element != null && !this.getTreeStructure().isAlwaysLeaf(element)) {
               this.insertLoadingNode(node, true);
            }
         } else {
            this.removeFromUnbuilt(node);
            this.removeLoading(node, true);
         }

      }
   }

   private boolean yieldAndRun(@NotNull Runnable runnable, @NotNull TreeUpdatePass pass) {
      if (runnable == null) {
         $$$reportNull$$$0(79);
      }

      if (pass == null) {
         $$$reportNull$$$0(80);
      }

      this.myYieldingPasses.add(pass);
      this.myYieldingNow = true;
      this.yield(new 33(this, "AbstractTreeUi.yieldAndRun", runnable, pass));
      return true;
   }

   private boolean isYeildingNow() {
      return this.myYieldingNow;
   }

   private boolean hasScheduledUpdates() {
      return this.getUpdater().hasNodesToUpdate();
   }

   public boolean isReady() {
      return this.isReady(false);
   }

   boolean isCancelledReady() {
      return this.isReady(false) && !this.myCancelledBuild.isEmpty();
   }

   public boolean isReady(boolean attempt) {
      if (attempt && this.myStateLock.isLocked()) {
         return false;
      } else {
         Boolean ready = this.checkValue(() -> {
            return this.isIdle() && !this.hasPendingWork() && !this.isNodeActionsPending();
         }, attempt);
         return ready != null && ready;
      }
   }

   @Nullable
   private Boolean checkValue(@NotNull Computable<Boolean> computable, boolean attempt) {
      if (computable == null) {
         $$$reportNull$$$0(81);
      }

      try {
         LockToken ignored = attempt ? this.attemptLock() : this.acquireLock();
         Throwable var4 = null;

         Boolean var5;
         try {
            var5 = (Boolean)computable.compute();
         } catch (Throwable var15) {
            var4 = var15;
            throw var15;
         } finally {
            if (ignored != null) {
               if (var4 != null) {
                  try {
                     ignored.close();
                  } catch (Throwable var14) {
                     var4.addSuppressed(var14);
                  }
               } else {
                  ignored.close();
               }
            }

         }

         return var5;
      } catch (InterruptedException var17) {
         LOG.info(var17);
         return null;
      }
   }

   @NotNull
   @NonNls
   public String getStatus() {
      String var10000 = "isReady=" + this.isReady() + "\n isIdle=" + this.isIdle() + "\n  isYeildingNow=" + this.isYeildingNow() + "\n  isWorkerBusy=" + this.isWorkerBusy() + "\n  hasUpdatingChildrenNow=" + this.hasUpdatingChildrenNow() + "\n  isLoadingInBackgroundNow=" + this.isLoadingInBackgroundNow() + "\n hasPendingWork=" + this.hasPendingWork() + "\n  hasNodesToUpdate=" + this.hasNodesToUpdate() + "\n  updaterState=" + this.myUpdaterState + "\n  hasScheduledUpdates=" + this.hasScheduledUpdates() + "\n  isPostponedMode=" + this.getUpdater().isInPostponeMode() + "\n nodeActions=" + this.myNodeActions.keySet() + "\n nodeChildrenActions=" + this.myNodeChildrenActions.keySet() + "\nisReleased=" + this.isReleased() + "\n isReleaseRequested=" + this.isReleaseRequested() + "\nisCancelProcessed=" + this.isCancelProcessed() + "\n isCancelRequested=" + this.myCancelRequest + "\n isResettingToReadyNow=" + this.myResettingToReadyNow + "\ncanInitiateNewActivity=" + this.canInitiateNewActivity() + "\nbatchIndicators=" + this.myBatchIndicators;
      if (var10000 == null) {
         $$$reportNull$$$0(82);
      }

      return var10000;
   }

   public boolean hasPendingWork() {
      return this.hasNodesToUpdate() || this.myUpdaterState != null && this.myUpdaterState.isProcessingNow() || this.hasScheduledUpdates() && !this.getUpdater().isInPostponeMode();
   }

   public boolean isIdle() {
      return !this.isYeildingNow() && !this.isWorkerBusy() && !this.hasUpdatingChildrenNow() && !this.isLoadingInBackgroundNow();
   }

   private void executeYieldingRequest(@NotNull Runnable runnable, @NotNull TreeUpdatePass pass) {
      if (runnable == null) {
         $$$reportNull$$$0(83);
      }

      if (pass == null) {
         $$$reportNull$$$0(84);
      }

      try {
         try {
            this.myYieldingPasses.remove(pass);
            if (!this.canInitiateNewActivity()) {
               throw new ProcessCanceledException();
            }

            runnable.run();
         } finally {
            if (!this.isReleased()) {
               this.maybeYieldingFinished();
            }

         }
      } catch (ProcessCanceledException var7) {
         this.resetToReady();
      }

   }

   private void maybeYieldingFinished() {
      if (this.myYieldingPasses.isEmpty()) {
         this.myYieldingNow = false;
         this.flushPendingNodeActions();
      }

   }

   void maybeReady() {
      this.assertIsDispatchThread();
      if (!this.isReleased()) {
         boolean ready = this.isReady(true);
         if (ready) {
            this.myRevalidatedObjects.clear();
            this.setCancelRequested(false);
            this.myResettingToReadyNow.set(false);
            this.myInitialized.setDone();
            if (this.canInitiateNewActivity() && this.myUpdaterState != null && !this.myUpdaterState.isProcessingNow()) {
               UpdaterTreeState oldState = this.myUpdaterState;
               if (!this.myUpdaterState.restore((DefaultMutableTreeNode)null)) {
                  this.setUpdaterState(oldState);
               }

               if (!this.isReady(true)) {
                  return;
               }
            }

            this.setHoldSize(false);
            if (this.myTree.isShowing() && this.getBuilder().isToEnsureSelectionOnFocusGained() && Registry.is("ide.tree.ensureSelectionOnFocusGained")) {
               TreeUtil.ensureSelection(this.myTree);
            }

            if (this.myInitialized.isDone()) {
               if (!this.isReleaseRequested() && !this.isCancelProcessed()) {
                  this.myBusyObject.onReady();
               } else {
                  this.myBusyObject.onReady(this);
               }
            }

            if (this.canInitiateNewActivity()) {
               TreePath[] selection = this.getTree().getSelectionPaths();
               Rectangle visible = this.getTree().getVisibleRect();
               if (selection != null) {
                  TreePath[] var4 = selection;
                  int var5 = selection.length;

                  for(int var6 = 0; var6 < var5; ++var6) {
                     TreePath each = var4[var6];
                     Rectangle bounds = this.getTree().getPathBounds(each);
                     if (bounds != null && (visible.contains(bounds) || visible.intersects(bounds))) {
                        this.getTree().repaint(bounds);
                     }
                  }
               }
            }

         }
      }
   }

   private void flushPendingNodeActions() {
      DefaultMutableTreeNode[] nodes = (DefaultMutableTreeNode[])this.myPendingNodeActions.toArray(new DefaultMutableTreeNode[0]);
      this.myPendingNodeActions.clear();
      DefaultMutableTreeNode[] var2 = nodes;
      int var3 = nodes.length;

      int var4;
      for(var4 = 0; var4 < var3; ++var4) {
         DefaultMutableTreeNode each = var2[var4];
         this.processNodeActionsIfReady(each);
      }

      Runnable[] actions = (Runnable[])this.myYieldingDoneRunnables.toArray(new Runnable[0]);
      Runnable[] var8 = actions;
      var4 = actions.length;

      for(int var9 = 0; var9 < var4; ++var9) {
         Runnable each = var8[var9];
         if (!this.isYeildingNow()) {
            this.myYieldingDoneRunnables.remove(each);
            each.run();
         }
      }

      this.maybeReady();
   }

   protected void runOnYieldingDone(@NotNull Runnable onDone) {
      if (onDone == null) {
         $$$reportNull$$$0(85);
      }

      this.getBuilder().runOnYieldingDone(onDone);
   }

   protected void yield(Runnable runnable) {
      this.getBuilder().yield(runnable);
   }

   @NotNull
   private MutualMap<Object, Integer> loadElementsFromStructure(NodeDescriptor descriptor, @Nullable com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren preloadedChildren) {
      MutualMap<Object, Integer> elementToIndexMap = new MutualMap(true);
      Object element = this.getElementFromDescriptor(descriptor);
      if (!this.isValid(element)) {
         if (elementToIndexMap == null) {
            $$$reportNull$$$0(86);
         }

         return elementToIndexMap;
      } else {
         List<Object> children = preloadedChildren != null ? preloadedChildren.getElements() : Arrays.asList(this.getChildrenFor(element));
         int index = 0;
         Iterator var7 = children.iterator();

         while(var7.hasNext()) {
            Object child = var7.next();
            if (this.isValid(child)) {
               elementToIndexMap.put(child, index);
               ++index;
            }
         }

         if (elementToIndexMap == null) {
            $$$reportNull$$$0(87);
         }

         return elementToIndexMap;
      }
   }

   public static boolean isLoadingNode(Object node) {
      return node instanceof LoadingNode;
   }

   @NotNull
   private AsyncResult<List<TreeNode>> collectNodesToInsert(NodeDescriptor descriptor, @NotNull MutualMap<Object, Integer> elementToIndexMap, DefaultMutableTreeNode parent, boolean addLoadingNode, @NotNull com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren loadedChildren) {
      if (elementToIndexMap == null) {
         $$$reportNull$$$0(88);
      }

      if (loadedChildren == null) {
         $$$reportNull$$$0(89);
      }

      AsyncResult<List<TreeNode>> result = new AsyncResult();
      List<TreeNode> nodesToInsert = new ArrayList();
      Collection<Object> allElements = elementToIndexMap.getKeys();
      ActionCallback processingDone = allElements.isEmpty() ? ActionCallback.DONE : new ActionCallback(allElements.size());

      NodeDescriptor childDescr;
      ActionCallback update;
      for(Iterator var10 = allElements.iterator(); var10.hasNext(); update.doWhenDone(new 34(this, "AbstractTreeUi.collectNodesToInsert: on done update", childDescr, parent, addLoadingNode, nodesToInsert, processingDone))) {
         Object child = var10.next();
         Integer index = (Integer)elementToIndexMap.getValue(child);
         boolean needToUpdate = false;
         NodeDescriptor loadedDesc = loadedChildren.getDescriptor(child);
         if (!this.isValid(loadedDesc, descriptor)) {
            childDescr = this.getTreeStructure().createDescriptor(child, descriptor);
            needToUpdate = true;
         } else {
            childDescr = loadedDesc;
         }

         if (index == null) {
            index = Integer.MAX_VALUE;
            needToUpdate = true;
         }

         childDescr.setIndex(index);
         update = new ActionCallback();
         if (needToUpdate) {
            this.update(childDescr, false).onSuccess((changes) -> {
               loadedChildren.putDescriptor(child, childDescr, changes);
               update.setDone();
            });
         } else {
            update.setDone();
         }
      }

      processingDone.doWhenDone(new 35(this, "AbstractTreeUi.collectNodesToInsert: on done processing", result, nodesToInsert));
      if (result == null) {
         $$$reportNull$$$0(90);
      }

      return result;
   }

   @NotNull
   protected DefaultMutableTreeNode createChildNode(NodeDescriptor descriptor) {
      return new com.intellij.ide.util.treeView.AbstractTreeUi.ElementNode(this, descriptor);
   }

   protected boolean canYield() {
      return this.myCanYield && this.myYieldingUpdate.asBoolean();
   }

   private long getClearOnHideDelay() {
      return this.myClearOnHideDelay;
   }

   @NotNull
   public ActionCallback getInitialized() {
      ActionCallback var10000 = this.myInitialized;
      if (var10000 == null) {
         $$$reportNull$$$0(91);
      }

      return var10000;
   }

   public ActionCallback getReady(@NotNull Object requestor) {
      if (requestor == null) {
         $$$reportNull$$$0(92);
      }

      return this.myBusyObject.getReady(requestor);
   }

   private ActionCallback _getReady() {
      return this.getReady(this);
   }

   private void addToUpdatingChildren(@NotNull DefaultMutableTreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(93);
      }

      synchronized(this.myUpdatingChildren) {
         this.myUpdatingChildren.add(node);
      }
   }

   private void removeFromUpdatingChildren(@NotNull DefaultMutableTreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(94);
      }

      synchronized(this.myUpdatingChildren) {
         this.myUpdatingChildren.remove(node);
      }
   }

   boolean isUpdatingChildrenNow(DefaultMutableTreeNode node) {
      synchronized(this.myUpdatingChildren) {
         return this.myUpdatingChildren.contains(node);
      }
   }

   boolean isParentUpdatingChildrenNow(@NotNull DefaultMutableTreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(95);
      }

      synchronized(this.myUpdatingChildren) {
         for(DefaultMutableTreeNode eachParent = (DefaultMutableTreeNode)node.getParent(); eachParent != null; eachParent = (DefaultMutableTreeNode)eachParent.getParent()) {
            if (this.myUpdatingChildren.contains(eachParent)) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean hasUpdatingChildrenNow() {
      synchronized(this.myUpdatingChildren) {
         return !this.myUpdatingChildren.isEmpty();
      }
   }

   @NotNull
   Map<Object, List<com.intellij.ide.util.treeView.AbstractTreeUi.NodeAction>> getNodeActions() {
      Map var10000 = this.myNodeActions;
      if (var10000 == null) {
         $$$reportNull$$$0(96);
      }

      return var10000;
   }

   @NotNull
   List<Object> getLoadedChildrenFor(@NotNull Object element) {
      if (element == null) {
         $$$reportNull$$$0(97);
      }

      List<Object> result = new ArrayList();
      DefaultMutableTreeNode node = this.getNodeForElement(element, false);
      if (node != null) {
         for(int i = 0; i < node.getChildCount(); ++i) {
            TreeNode each = node.getChildAt(i);
            if (!isLoadingNode(each)) {
               result.add(this.getElementFor(each));
            }
         }
      }

      if (result == null) {
         $$$reportNull$$$0(98);
      }

      return result;
   }

   boolean hasNodesToUpdate() {
      return this.getUpdater().hasNodesToUpdate();
   }

   @NotNull
   public List<Object> getExpandedElements() {
      List<Object> result = new ArrayList();
      if (this.isReleased()) {
         if (result == null) {
            $$$reportNull$$$0(99);
         }

         return result;
      } else {
         Enumeration<TreePath> enumeration = this.myTree.getExpandedDescendants(getPathFor(this.getRootNode()));
         if (enumeration != null) {
            while(enumeration.hasMoreElements()) {
               TreePath each = (TreePath)enumeration.nextElement();
               Object eachElement = this.getElementFor(each.getLastPathComponent());
               if (eachElement != null) {
                  result.add(eachElement);
               }
            }
         }

         if (result == null) {
            $$$reportNull$$$0(100);
         }

         return result;
      }
   }

   @NotNull
   public ActionCallback cancelUpdate() {
      if (this.isReleased()) {
         ActionCallback var10000 = ActionCallback.REJECTED;
         if (var10000 == null) {
            $$$reportNull$$$0(101);
         }

         return var10000;
      } else {
         this.setCancelRequested(true);
         ActionCallback done = new ActionCallback();
         this.invokeLaterIfNeeded(false, new 36(this, "AbstractTreeUi.cancelUpdate", done));
         if (isEdt() || this.isPassthroughMode()) {
            this.maybeReady();
         }

         if (done == null) {
            $$$reportNull$$$0(102);
         }

         return done;
      }
   }

   private void setCancelRequested(boolean requested) {
      try {
         LockToken ignored = isUnitTestingMode() ? this.acquireLock() : this.attemptLock();
         Throwable var3 = null;

         try {
            this.myCancelRequest.set(requested);
         } catch (Throwable var13) {
            var3 = var13;
            throw var13;
         } finally {
            if (ignored != null) {
               if (var3 != null) {
                  try {
                     ignored.close();
                  } catch (Throwable var12) {
                     var3.addSuppressed(var12);
                  }
               } else {
                  ignored.close();
               }
            }

         }
      } catch (InterruptedException var15) {
      }

   }

   @Nullable
   private LockToken attemptLock() throws InterruptedException {
      return LockToken.attemptLock(this.myStateLock, (long)Registry.intValue("ide.tree.uiLockAttempt"));
   }

   @NotNull
   private LockToken acquireLock() {
      LockToken var10000 = LockToken.acquireLock(this.myStateLock);
      if (var10000 == null) {
         $$$reportNull$$$0(103);
      }

      return var10000;
   }

   @NotNull
   public ActionCallback batch(@NotNull Progressive progressive) {
      if (progressive == null) {
         $$$reportNull$$$0(104);
      }

      this.assertIsDispatchThread();
      EmptyProgressIndicator indicator = new EmptyProgressIndicator();
      ActionCallback callback = new ActionCallback();
      this.myBatchIndicators.put(progressive, indicator);
      this.myBatchCallbacks.put(progressive, callback);
      boolean var9 = false;

      ActionCallback var10000;
      label116: {
         ActionCallback var5;
         try {
            var9 = true;
            progressive.run(indicator);
            var9 = false;
            break label116;
         } catch (ProcessCanceledException var10) {
            this.resetToReadyNow().doWhenProcessed(new 37(this, "AbstractTreeUi.batch: catch", callback));
            var5 = callback;
            var9 = false;
         } finally {
            if (var9) {
               if (this.isReleased()) {
                  var10000 = ActionCallback.REJECTED;
                  if (var10000 == null) {
                     $$$reportNull$$$0(108);
                  }

                  return var10000;
               }

               this._getReady().doWhenDone(new 38(this, "AbstractTreeUi.batch: finally", progressive, callback));
               this.maybeReady();
            }
         }

         if (this.isReleased()) {
            var10000 = ActionCallback.REJECTED;
            if (var10000 == null) {
               $$$reportNull$$$0(106);
            }

            return var10000;
         }

         this._getReady().doWhenDone(new 38(this, "AbstractTreeUi.batch: finally", progressive, callback));
         this.maybeReady();
         if (var5 == null) {
            $$$reportNull$$$0(107);
         }

         return var5;
      }

      if (this.isReleased()) {
         var10000 = ActionCallback.REJECTED;
         if (var10000 == null) {
            $$$reportNull$$$0(105);
         }

         return var10000;
      } else {
         this._getReady().doWhenDone(new 38(this, "AbstractTreeUi.batch: finally", progressive, callback));
         this.maybeReady();
         if (callback == null) {
            $$$reportNull$$$0(109);
         }

         return callback;
      }
   }

   boolean isCancelProcessed() {
      return this.myCancelRequest.get() || this.myResettingToReadyNow.get();
   }

   boolean isToPaintSelection() {
      return this.isReady(true) || !this.mySelectionIsAdjusted;
   }

   boolean isReleaseRequested() {
      return this.myReleaseRequested;
   }

   public void executeUserRunnable(@NotNull Runnable runnable) {
      if (runnable == null) {
         $$$reportNull$$$0(110);
      }

      try {
         this.myUserRunnables.add(runnable);
         runnable.run();
      } finally {
         this.myUserRunnables.remove(runnable);
      }

   }

   private boolean isUpdatingParent(DefaultMutableTreeNode kid) {
      return this.getUpdatingParent(kid) != null;
   }

   @Nullable
   private DefaultMutableTreeNode getUpdatingParent(DefaultMutableTreeNode kid) {
      for(DefaultMutableTreeNode eachParent = kid; eachParent != null; eachParent = (DefaultMutableTreeNode)eachParent.getParent()) {
         if (this.isUpdatingChildrenNow(eachParent)) {
            return eachParent;
         }
      }

      return null;
   }

   private boolean isLoadedInBackground(Object element) {
      return this.getLoadedInBackground(element) != null;
   }

   private com.intellij.ide.util.treeView.AbstractTreeUi.UpdateInfo getLoadedInBackground(Object element) {
      synchronized(this.myLoadedInBackground) {
         return isNodeNull(element) ? null : (com.intellij.ide.util.treeView.AbstractTreeUi.UpdateInfo)this.myLoadedInBackground.get(element);
      }
   }

   private void addToLoadedInBackground(Object element, com.intellij.ide.util.treeView.AbstractTreeUi.UpdateInfo info) {
      if (!isNodeNull(element)) {
         synchronized(this.myLoadedInBackground) {
            this.warnMap("put into myLoadedInBackground: ", this.myLoadedInBackground);
            this.myLoadedInBackground.put(element, info);
         }
      }
   }

   private void removeFromLoadedInBackground(Object element) {
      if (!isNodeNull(element)) {
         synchronized(this.myLoadedInBackground) {
            this.warnMap("remove from myLoadedInBackground: ", this.myLoadedInBackground);
            this.myLoadedInBackground.remove(element);
         }
      }
   }

   private boolean isLoadingInBackgroundNow() {
      synchronized(this.myLoadedInBackground) {
         return !this.myLoadedInBackground.isEmpty();
      }
   }

   private void queueBackgroundUpdate(@NotNull com.intellij.ide.util.treeView.AbstractTreeUi.UpdateInfo updateInfo, @NotNull DefaultMutableTreeNode node) {
      if (updateInfo == null) {
         $$$reportNull$$$0(111);
      }

      if (node == null) {
         $$$reportNull$$$0(112);
      }

      this.assertIsDispatchThread();
      Object oldElementFromDescriptor = this.getElementFromDescriptor(updateInfo.getDescriptor());
      if (!isNodeNull(oldElementFromDescriptor)) {
         com.intellij.ide.util.treeView.AbstractTreeUi.UpdateInfo loaded = this.getLoadedInBackground(oldElementFromDescriptor);
         if (loaded != null) {
            loaded.apply(updateInfo);
         } else {
            this.addToLoadedInBackground(oldElementFromDescriptor, updateInfo);
            this.maybeSetBusyAndScheduleWaiterForReady(true, oldElementFromDescriptor);
            if (!this.isNodeBeingBuilt((Object)node)) {
               LoadingNode loadingNode = new LoadingNode(getLoadingNodeText());
               this.myTreeModel.insertNodeInto(loadingNode, node, node.getChildCount());
            }

            this.removeFromUnbuilt(node);
            Ref<com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren> children = new Ref();
            Ref<Object> elementFromDescriptor = new Ref();
            DefaultMutableTreeNode[] nodeToProcessActions = new DefaultMutableTreeNode[1];
            TreeConsumer<Void> finalizeRunnable = new 39(this, "AbstractTreeUi.queueBackgroundUpdate: finalize", node, elementFromDescriptor, oldElementFromDescriptor, nodeToProcessActions);
            Runnable buildRunnable = new 40(this, "AbstractTreeUi.queueBackgroundUpdate: build", updateInfo, finalizeRunnable, nodeToProcessActions, node, oldElementFromDescriptor, elementFromDescriptor, children);
            Runnable updateRunnable = new 41(this, "AbstractTreeUi.queueBackgroundUpdate: update", updateInfo, finalizeRunnable, children, elementFromDescriptor, node, nodeToProcessActions);
            this.queueToBackground(buildRunnable, updateRunnable).onSuccess(finalizeRunnable).onError(new 42(this, "AbstractTreeUi.queueBackgroundUpdate: on rejected", updateInfo));
         }
      }
   }

   private boolean isExpanded(@NotNull DefaultMutableTreeNode node, boolean isExpanded) {
      if (node == null) {
         $$$reportNull$$$0(113);
      }

      return isExpanded || this.myTree.isExpanded(getPathFor(node));
   }

   private void removeLoading(@NotNull DefaultMutableTreeNode parent, boolean forced) {
      if (parent == null) {
         $$$reportNull$$$0(114);
      }

      if (forced || !this.myUnbuiltNodes.contains(parent) || this.myCancelledBuild.containsKey(parent)) {
         boolean reallyRemoved = false;

         for(int i = 0; i < parent.getChildCount(); ++i) {
            TreeNode child = parent.getChildAt(i);
            if (this.removeIfLoading(child)) {
               reallyRemoved = true;
               --i;
            }
         }

         this.maybeReady();
         if (reallyRemoved) {
            this.nodeStructureChanged(parent);
         }

      }
   }

   private void processNodeActionsIfReady(@NotNull DefaultMutableTreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(115);
      }

      this.assertIsDispatchThread();
      if (!this.isNodeBeingBuilt((Object)node)) {
         NodeDescriptor descriptor = getDescriptorFrom(node);
         if (descriptor != null) {
            if (this.isYeildingNow()) {
               this.myPendingNodeActions.add(node);
            } else {
               Object element = this.getElementFromDescriptor(descriptor);
               boolean childrenReady = !this.isLoadedInBackground(element) && !this.isUpdatingChildrenNow(node);
               processActions(node, element, this.myNodeActions, childrenReady ? this.myNodeChildrenActions : null);
               if (childrenReady) {
                  processActions(node, element, this.myNodeChildrenActions, (Map)null);
               }

               this.warnMap("myNodeActions: processNodeActionsIfReady: ", this.myNodeActions);
               this.warnMap("myNodeChildrenActions: processNodeActionsIfReady: ", this.myNodeChildrenActions);
               if (!this.isUpdatingParent(node) && !this.isWorkerBusy()) {
                  UpdaterTreeState state = this.myUpdaterState;
                  if (this.myNodeActions.isEmpty() && state != null && !state.isProcessingNow() && this.canInitiateNewActivity() && !state.restore(childrenReady ? node : null)) {
                     this.setUpdaterState(state);
                  }
               }

               this.maybeReady();
            }
         }
      }
   }

   private static void processActions(@NotNull DefaultMutableTreeNode node, Object element, @NotNull Map<Object, List<com.intellij.ide.util.treeView.AbstractTreeUi.NodeAction>> nodeActions, @Nullable Map<Object, List<com.intellij.ide.util.treeView.AbstractTreeUi.NodeAction>> secondaryNodeAction) {
      if (node == null) {
         $$$reportNull$$$0(116);
      }

      if (nodeActions == null) {
         $$$reportNull$$$0(117);
      }

      List<com.intellij.ide.util.treeView.AbstractTreeUi.NodeAction> actions = (List)nodeActions.get(element);
      if (actions != null) {
         nodeActions.remove(element);
         List<com.intellij.ide.util.treeView.AbstractTreeUi.NodeAction> secondary = secondaryNodeAction != null ? (List)secondaryNodeAction.get(element) : null;

         com.intellij.ide.util.treeView.AbstractTreeUi.NodeAction each;
         for(Iterator var6 = actions.iterator(); var6.hasNext(); each.onReady(node)) {
            each = (com.intellij.ide.util.treeView.AbstractTreeUi.NodeAction)var6.next();
            if (secondary != null) {
               secondary.remove(each);
            }
         }
      }

   }

   private boolean canSmartExpand(DefaultMutableTreeNode node, boolean canSmartExpand) {
      if (!this.canInitiateNewActivity()) {
         return false;
      } else if (!this.getBuilder().isSmartExpand()) {
         return false;
      } else {
         boolean smartExpand = canSmartExpand && !this.myNotForSmartExpand.contains(node);
         Object element = this.getElementFor(node);
         return smartExpand && element != null && this.validateAutoExpand(true, element);
      }
   }

   private void processSmartExpand(@NotNull DefaultMutableTreeNode node, boolean canSmartExpand, boolean forced) {
      if (node == null) {
         $$$reportNull$$$0(118);
      }

      if (this.canInitiateNewActivity()) {
         if (this.getBuilder().isSmartExpand()) {
            boolean can = this.canSmartExpand(node, canSmartExpand);
            if (can || forced) {
               if (this.isNodeBeingBuilt((Object)node) && !forced) {
                  this.addNodeAction(this.getElementFor(node), true, (node1) -> {
                     this.processSmartExpand(node1, canSmartExpand, true);
                  });
               } else {
                  TreeNode child = getChildForSmartExpand(node);
                  if (child != null) {
                     TreePath childPath = (new TreePath(node.getPath())).pathByAddingChild(child);
                     this.processInnerChange(new 43(this, "AbstractTreeUi.processSmartExpand", childPath));
                  }
               }

            }
         }
      }
   }

   @Nullable
   private static TreeNode getChildForSmartExpand(@NotNull DefaultMutableTreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(119);
      }

      int realChildCount = 0;
      TreeNode nodeToExpand = null;

      for(int i = 0; i < node.getChildCount(); ++i) {
         TreeNode eachChild = node.getChildAt(i);
         if (!isLoadingNode(eachChild)) {
            ++realChildCount;
            if (nodeToExpand == null) {
               nodeToExpand = eachChild;
            }
         }

         if (realChildCount > 1) {
            nodeToExpand = null;
            break;
         }
      }

      return nodeToExpand;
   }

   public static boolean isLoadingChildrenFor(Object nodeObject) {
      if (!(nodeObject instanceof DefaultMutableTreeNode)) {
         return false;
      } else {
         DefaultMutableTreeNode node = (DefaultMutableTreeNode)nodeObject;
         int loadingNodes = 0;

         for(int i = 0; i < Math.min(node.getChildCount(), 2); ++i) {
            TreeNode child = node.getChildAt(i);
            if (isLoadingNode(child)) {
               ++loadingNodes;
            }
         }

         return loadingNodes > 0 && loadingNodes == node.getChildCount();
      }
   }

   boolean isParentLoadingInBackground(@NotNull Object nodeObject) {
      if (nodeObject == null) {
         $$$reportNull$$$0(120);
      }

      return this.getParentLoadingInBackground(nodeObject) != null;
   }

   @Nullable
   private DefaultMutableTreeNode getParentLoadingInBackground(@NotNull Object nodeObject) {
      if (nodeObject == null) {
         $$$reportNull$$$0(121);
      }

      if (!(nodeObject instanceof DefaultMutableTreeNode)) {
         return null;
      } else {
         DefaultMutableTreeNode node = (DefaultMutableTreeNode)nodeObject;
         TreeNode eachParent = node.getParent();

         while(eachParent != null) {
            eachParent = eachParent.getParent();
            if (eachParent instanceof DefaultMutableTreeNode) {
               Object eachElement = this.getElementFor(eachParent);
               if (this.isLoadedInBackground(eachElement)) {
                  return (DefaultMutableTreeNode)eachParent;
               }
            }
         }

         return null;
      }
   }

   private static String getLoadingNodeText() {
      return IdeBundle.message("progress.searching", new Object[0]);
   }

   @NotNull
   private Promise<?> processExistingNode(@NotNull DefaultMutableTreeNode childNode, NodeDescriptor childDescriptor, @NotNull DefaultMutableTreeNode parentNode, @NotNull MutualMap<Object, Integer> elementToIndexMap, @NotNull TreeUpdatePass pass, boolean canSmartExpand, boolean forceUpdate, @Nullable com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren parentPreloadedChildren) {
      if (childNode == null) {
         $$$reportNull$$$0(122);
      }

      if (parentNode == null) {
         $$$reportNull$$$0(123);
      }

      if (elementToIndexMap == null) {
         $$$reportNull$$$0(124);
      }

      if (pass == null) {
         $$$reportNull$$$0(125);
      }

      Promise var10000;
      if (pass.isExpired()) {
         var10000 = Promises.rejectedPromise();
         if (var10000 == null) {
            $$$reportNull$$$0(126);
         }

         return var10000;
      } else if (childDescriptor == null) {
         pass.expire();
         var10000 = Promises.rejectedPromise();
         if (var10000 == null) {
            $$$reportNull$$$0(127);
         }

         return var10000;
      } else {
         Object oldElement = this.getElementFromDescriptor(childDescriptor);
         if (isNodeNull(oldElement)) {
            this.removeNodeFromParent(childNode, true);
            this.doUpdateNode(parentNode);
            var10000 = Promises.resolvedPromise();
            if (var10000 == null) {
               $$$reportNull$$$0(128);
            }

            return var10000;
         } else {
            Promise update;
            if (parentPreloadedChildren != null && parentPreloadedChildren.getDescriptor(oldElement) == childDescriptor) {
               update = Promises.resolvedPromise(parentPreloadedChildren.isUpdated(oldElement));
            } else {
               update = this.update(childDescriptor, false);
            }

            AsyncPromise<Void> result = new AsyncPromise();
            Ref<NodeDescriptor> childDesc = new Ref(childDescriptor);
            update.onSuccess((isChanged) -> {
               AtomicBoolean changes = new AtomicBoolean(isChanged);
               AtomicBoolean forceRemapping = new AtomicBoolean();
               Ref<Object> newElement = new Ref(this.getElementFromDescriptor((NodeDescriptor)childDesc.get()));
               Integer index = newElement.get() == null ? null : (Integer)elementToIndexMap.getValue(this.getElementFromDescriptor((NodeDescriptor)childDesc.get()));
               Object promise;
               if (index == null) {
                  promise = Promises.resolvedPromise(false);
               } else {
                  Object elementFromMap = elementToIndexMap.getKey(index);
                  if (elementFromMap != newElement.get() && elementFromMap.equals(newElement.get())) {
                     if (this.isInStructure(elementFromMap) && this.isInStructure(newElement.get())) {
                        AsyncPromise<Boolean> updateIndexDone = new AsyncPromise();
                        promise = updateIndexDone;
                        NodeDescriptor parentDescriptor = getDescriptorFrom(parentNode);
                        if (parentDescriptor != null) {
                           childDesc.set(this.getTreeStructure().createDescriptor(elementFromMap, parentDescriptor));
                           NodeDescriptor oldDesc = getDescriptorFrom(childNode);
                           if (this.isValid(oldDesc)) {
                              ((NodeDescriptor)childDesc.get()).applyFrom(oldDesc);
                           }

                           childNode.setUserObject(childDesc.get());
                           newElement.set(elementFromMap);
                           forceRemapping.set(true);
                           this.update((NodeDescriptor)childDesc.get(), false).onSuccess((isChanged1) -> {
                              changes.set(isChanged1);
                              updateIndexDone.setResult(isChanged1);
                           });
                        }
                     } else {
                        promise = Promises.resolvedPromise(changes.get());
                     }
                  } else {
                     promise = Promises.resolvedPromise(changes.get());
                  }

                  ((Promise)promise).onSuccess(new 44(this, "AbstractTreeUi.processExistingNode: on done index updating after update", childDesc, index, changes));
               }

               ((Promise)promise).onSuccess(new 45(this, "AbstractTreeUi.processExistingNode: on done index updating", oldElement, newElement, forceRemapping, childNode, parentNode, index, result, elementToIndexMap, childDesc, pass, canSmartExpand, forceUpdate));
            });
            if (result == null) {
               $$$reportNull$$$0(129);
            }

            return result;
         }
      }
   }

   private void adjustSelectionOnChildRemove(@NotNull DefaultMutableTreeNode parentNode, int selectedIndex, Object disposedElement) {
      if (parentNode == null) {
         $$$reportNull$$$0(130);
      }

      if (selectedIndex < 0 || this.getSelectedElements().isEmpty()) {
         DefaultMutableTreeNode node = disposedElement == null ? null : this.getNodeForElement(disposedElement, false);
         if (node != null && this.isValidForSelectionAdjusting(node)) {
            Object newElement = this.getElementFor(node);
            this.addSelectionPath(getPathFor(node), true, this.getExpiredElementCondition(newElement), disposedElement);
         } else {
            if (selectedIndex >= 0) {
               if (parentNode.getChildCount() > 0) {
                  TreeNode newChildNode;
                  if (parentNode.getChildCount() > selectedIndex) {
                     newChildNode = parentNode.getChildAt(selectedIndex);
                     if (this.isValidForSelectionAdjusting(newChildNode)) {
                        this.addSelectionPath(new TreePath(this.myTreeModel.getPathToRoot(newChildNode)), true, this.getExpiredElementCondition(disposedElement), disposedElement);
                     }
                  } else {
                     newChildNode = parentNode.getChildAt(parentNode.getChildCount() - 1);
                     if (this.isValidForSelectionAdjusting(newChildNode)) {
                        this.addSelectionPath(new TreePath(this.myTreeModel.getPathToRoot(newChildNode)), true, this.getExpiredElementCondition(disposedElement), disposedElement);
                     }
                  }
               } else {
                  this.addSelectionPath(new TreePath(this.myTreeModel.getPathToRoot(parentNode)), true, this.getExpiredElementCondition(disposedElement), disposedElement);
               }
            }

         }
      }
   }

   private boolean isValidForSelectionAdjusting(@NotNull TreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(131);
      }

      if (!this.myTree.isRootVisible() && this.getRootNode() == node) {
         return false;
      } else if (isLoadingNode(node)) {
         return true;
      } else {
         Object elementInTree = this.getElementFor(node);
         if (elementInTree == null) {
            return false;
         } else {
            TreeNode parentNode = node.getParent();
            Object parentElementInTree = this.getElementFor(parentNode);
            if (parentElementInTree == null) {
               return false;
            } else {
               Object parentElement = this.getTreeStructure().getParentElement(elementInTree);
               return parentElementInTree.equals(parentElement);
            }
         }
      }
   }

   @NotNull
   private Condition getExpiredElementCondition(Object element) {
      Condition var10000 = (o) -> {
         return this.isInStructure(element);
      };
      if (var10000 == null) {
         $$$reportNull$$$0(132);
      }

      return var10000;
   }

   private void addSelectionPath(@NotNull TreePath path, boolean isAdjustedSelection, Condition isExpiredAdjustment, @Nullable Object adjustmentCause) {
      if (path == null) {
         $$$reportNull$$$0(133);
      }

      this.processInnerChange(new 46(this, "AbstractTreeUi.addSelectionPath", path, isAdjustedSelection, isExpiredAdjustment, adjustmentCause));
   }

   @NotNull
   private static TreePath getPathFor(@NotNull TreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(134);
      }

      if (node instanceof DefaultMutableTreeNode) {
         return new TreePath(((DefaultMutableTreeNode)node).getPath());
      } else {
         List<TreeNode> nodes = new ArrayList();

         for(TreeNode eachParent = node; eachParent != null; eachParent = eachParent.getParent()) {
            nodes.add(eachParent);
         }

         return new TreePath(ArrayUtil.toObjectArray(nodes));
      }
   }

   private void removeNodeFromParent(@NotNull MutableTreeNode node, boolean willAdjustSelection) {
      if (node == null) {
         $$$reportNull$$$0(135);
      }

      this.processInnerChange(new 47(this, "AbstractTreeUi.removeNodeFromParent", willAdjustSelection, node));
   }

   private void expandPath(@NotNull TreePath path, boolean canSmartExpand) {
      if (path == null) {
         $$$reportNull$$$0(136);
      }

      this.processInnerChange(new 48(this, "AbstractTreeUi.expandPath", path, canSmartExpand));
   }

   private void processInnerChange(Runnable runnable) {
      if (this.myUpdaterState == null) {
         this.setUpdaterState(new UpdaterTreeState(this));
      }

      this.myUpdaterState.process(runnable);
   }

   private boolean isInnerChange() {
      return this.myUpdaterState != null && this.myUpdaterState.isProcessingNow() && this.myUserRunnables.isEmpty();
   }

   private void makeLoadingOrLeafIfNoChildren(@NotNull DefaultMutableTreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(137);
      }

      TreePath path = getPathFor(node);
      this.insertLoadingNode(node, true);
      NodeDescriptor descriptor = getDescriptorFrom(node);
      if (descriptor != null) {
         descriptor.setChildrenSortingStamp(-1L);
         if (!this.getBuilder().isAlwaysShowPlus(descriptor)) {
            TreePath parentPath = path.getParentPath();
            if (this.myTree.isVisible(path) || parentPath != null && this.myTree.isExpanded(parentPath)) {
               if (this.myTree.isExpanded(path)) {
                  this.addSubtreeToUpdate(node);
               } else {
                  this.insertLoadingNode(node, false);
               }
            }

         }
      }
   }

   private boolean isValid(NodeDescriptor descriptor, NodeDescriptor parent) {
      if (descriptor == null) {
         return false;
      } else {
         return parent != null && parent != descriptor.getParentDescriptor() ? false : this.isValid(this.getElementFromDescriptor(descriptor));
      }
   }

   private boolean isValid(@Nullable NodeDescriptor descriptor) {
      return descriptor != null && this.isValid(this.getElementFromDescriptor(descriptor));
   }

   private boolean isValid(Object element) {
      if (isNodeNull(element)) {
         return false;
      } else {
         return element instanceof ValidateableNode && !((ValidateableNode)element).isValid() ? false : this.getBuilder().validateNode(element);
      }
   }

   private void insertLoadingNode(DefaultMutableTreeNode node, boolean addToUnbuilt) {
      if (!isLoadingChildrenFor(node)) {
         this.myTreeModel.insertNodeInto(new LoadingNode(), node, 0);
      }

      if (addToUnbuilt) {
         this.addToUnbuilt(node);
      }

   }

   @NotNull
   private Promise<Void> queueToBackground(@NotNull Runnable bgBuildAction, @Nullable Runnable edtPostRunnable) {
      if (bgBuildAction == null) {
         $$$reportNull$$$0(138);
      }

      if (!this.canInitiateNewActivity()) {
         Promise var10000 = Promises.rejectedPromise();
         if (var10000 == null) {
            $$$reportNull$$$0(139);
         }

         return var10000;
      } else {
         AsyncPromise<Void> result = new AsyncPromise();
         AtomicReference<ProcessCanceledException> fail = new AtomicReference();
         Runnable finalizer = new 49(this, "AbstractTreeUi.queueToBackground: finalizer", fail, result);
         this.registerWorkerTask(bgBuildAction);
         Runnable pooledThreadWithProgressRunnable = new 50(this, "AbstractTreeUi.queueToBackground: progress", bgBuildAction, edtPostRunnable, fail, finalizer);
         Runnable pooledThreadRunnable = new 51(this, "AbstractTreeUi.queueToBackground", pooledThreadWithProgressRunnable, fail, bgBuildAction, finalizer);
         if (this.isPassthroughMode()) {
            this.execute((Runnable)pooledThreadRunnable);
         } else {
            this.myWorker.addFirst(pooledThreadRunnable);
         }

         if (result == null) {
            $$$reportNull$$$0(140);
         }

         return result;
      }
   }

   private void registerWorkerTask(@NotNull Runnable runnable) {
      if (runnable == null) {
         $$$reportNull$$$0(141);
      }

      synchronized(this.myActiveWorkerTasks) {
         this.myActiveWorkerTasks.add(runnable);
      }
   }

   private void unregisterWorkerTask(@NotNull Runnable runnable, @Nullable Runnable finalizeRunnable) {
      if (runnable == null) {
         $$$reportNull$$$0(142);
      }

      boolean wasRemoved;
      synchronized(this.myActiveWorkerTasks) {
         wasRemoved = this.myActiveWorkerTasks.remove(runnable);
      }

      if (wasRemoved && finalizeRunnable != null) {
         finalizeRunnable.run();
      }

      this.invokeLaterIfNeeded(false, new 52(this, "AbstractTreeUi.unregisterWorkerTask"));
   }

   private boolean isWorkerBusy() {
      synchronized(this.myActiveWorkerTasks) {
         return !this.myActiveWorkerTasks.isEmpty();
      }
   }

   private void clearWorkerTasks() {
      synchronized(this.myActiveWorkerTasks) {
         this.myActiveWorkerTasks.clear();
      }
   }

   private void updateNodeImageAndPosition(@NotNull DefaultMutableTreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(143);
      }

      NodeDescriptor descriptor = getDescriptorFrom(node);
      if (descriptor != null) {
         if (this.getElementFromDescriptor(descriptor) != null) {
            this.nodeChanged(node);
         }
      }
   }

   private void nodeChanged(DefaultMutableTreeNode node) {
      this.invokeLaterIfNeeded(true, new 53(this, "AbstractTreeUi.nodeChanged", node));
   }

   private void nodeStructureChanged(DefaultMutableTreeNode node) {
      this.invokeLaterIfNeeded(true, new 54(this, "AbstractTreeUi.nodeStructureChanged", node));
   }

   public DefaultTreeModel getTreeModel() {
      return this.myTreeModel;
   }

   private void insertNodesInto(@NotNull List<? extends TreeNode> toInsert, @NotNull DefaultMutableTreeNode parentNode) {
      if (toInsert == null) {
         $$$reportNull$$$0(144);
      }

      if (parentNode == null) {
         $$$reportNull$$$0(145);
      }

      this.sortChildren(parentNode, toInsert, false, true);
      List<TreeNode> all = new ArrayList(toInsert.size() + parentNode.getChildCount());
      all.addAll(toInsert);
      all.addAll(TreeUtil.listChildren(parentNode));
      if (!toInsert.isEmpty()) {
         this.sortChildren(parentNode, all, true, true);
         int[] newNodeIndices = new int[toInsert.size()];
         int eachNewNodeIndex = 0;
         TreeMap<Integer, TreeNode> insertSet = new TreeMap();

         for(int i = 0; i < toInsert.size(); ++i) {
            TreeNode eachNewNode;
            for(eachNewNode = (TreeNode)toInsert.get(i); all.get(eachNewNodeIndex) != eachNewNode; ++eachNewNodeIndex) {
            }

            newNodeIndices[i] = eachNewNodeIndex;
            insertSet.put(eachNewNodeIndex, eachNewNode);
         }

         Iterator var12 = insertSet.entrySet().iterator();

         while(var12.hasNext()) {
            Entry<Integer, TreeNode> entry = (Entry)var12.next();
            TreeNode eachNode = (TreeNode)entry.getValue();
            Integer index = (Integer)entry.getKey();
            parentNode.insert((MutableTreeNode)eachNode, index);
         }

         this.myTreeModel.nodesWereInserted(parentNode, newNodeIndices);
      } else {
         List<TreeNode> before = new ArrayList(all);
         this.sortChildren(parentNode, all, true, false);
         if (!before.equals(all)) {
            this.processInnerChange(new 55(this, "AbstractTreeUi.insertNodesInto", parentNode, all));
         }
      }

   }

   private void sortChildren(@NotNull DefaultMutableTreeNode node, @NotNull List<? extends TreeNode> children, boolean updateStamp, boolean forceSort) {
      if (node == null) {
         $$$reportNull$$$0(146);
      }

      if (children == null) {
         $$$reportNull$$$0(147);
      }

      NodeDescriptor descriptor = getDescriptorFrom(node);

      assert descriptor != null;

      if (descriptor.getChildrenSortingStamp() < this.getComparatorStamp() || forceSort) {
         if (!children.isEmpty()) {
            try {
               this.getBuilder().sortChildren(this.myNodeComparator, node, children);
            } catch (IllegalArgumentException var8) {
               StringBuilder sb = (new StringBuilder("cannot sort children in ")).append(this.toString());
               children.forEach((child) -> {
                  sb.append('\n').append(child);
               });
               throw new IllegalArgumentException(sb.toString(), var8);
            }
         }

         if (updateStamp) {
            descriptor.setChildrenSortingStamp(this.getComparatorStamp());
         }

      }
   }

   private void disposeNode(@NotNull DefaultMutableTreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(148);
      }

      TreeNode parent = node.getParent();
      if (parent instanceof DefaultMutableTreeNode) {
         this.addToUnbuilt((DefaultMutableTreeNode)parent);
      }

      if (node.getChildCount() > 0) {
         for(DefaultMutableTreeNode _node = (DefaultMutableTreeNode)node.getFirstChild(); _node != null; _node = _node.getNextSibling()) {
            this.disposeNode(_node);
         }
      }

      this.removeFromUpdatingChildren(node);
      this.removeFromUnbuilt(node);
      this.removeFromCancelled(node);
      if (!isLoadingNode(node)) {
         NodeDescriptor descriptor = getDescriptorFrom(node);
         if (descriptor != null) {
            Object element = this.getElementFromDescriptor(descriptor);
            if (!isNodeNull(element)) {
               this.removeMapping(element, node, (Object)null);
            }

            this.myAutoExpandRoots.remove(element);
            node.setUserObject((Object)null);
            node.removeAllChildren();
         }
      }
   }

   public boolean addSubtreeToUpdate(@NotNull DefaultMutableTreeNode root) {
      if (root == null) {
         $$$reportNull$$$0(149);
      }

      return this.addSubtreeToUpdate(root, true);
   }

   public boolean addSubtreeToUpdate(@NotNull DefaultMutableTreeNode root, boolean updateStructure) {
      if (root == null) {
         $$$reportNull$$$0(150);
      }

      return this.addSubtreeToUpdate(root, (Runnable)null, updateStructure);
   }

   public boolean addSubtreeToUpdate(@NotNull DefaultMutableTreeNode root, Runnable runAfterUpdate) {
      if (root == null) {
         $$$reportNull$$$0(151);
      }

      return this.addSubtreeToUpdate(root, runAfterUpdate, true);
   }

   public boolean addSubtreeToUpdate(@NotNull DefaultMutableTreeNode root, @Nullable Runnable runAfterUpdate, boolean updateStructure) {
      if (root == null) {
         $$$reportNull$$$0(152);
      }

      Object element = this.getElementFor(root);
      boolean alwaysLeaf = element != null && this.getTreeStructure().isAlwaysLeaf(element);
      TreeUpdatePass updatePass;
      if (alwaysLeaf) {
         this.removeFromUnbuilt(root);
         this.removeLoading(root, true);
         updatePass = (new TreeUpdatePass(root)).setUpdateChildren(false);
      } else {
         updatePass = (new TreeUpdatePass(root)).setUpdateStructure(updateStructure).setUpdateStamp(-1L);
      }

      AbstractTreeUpdater updater = this.getUpdater();
      updater.runAfterUpdate(runAfterUpdate);
      updater.addSubtreeToUpdate(updatePass);
      return !alwaysLeaf;
   }

   boolean wasRootNodeInitialized() {
      return this.myRootNodeWasQueuedToInitialize && this.myRootNodeInitialized;
   }

   public void select(@NotNull Object[] elements, @Nullable Runnable onDone) {
      if (elements == null) {
         $$$reportNull$$$0(153);
      }

      this.select(elements, onDone, false);
   }

   public void select(@NotNull Object[] elements, @Nullable Runnable onDone, boolean addToSelection) {
      if (elements == null) {
         $$$reportNull$$$0(154);
      }

      this.select(elements, onDone, addToSelection, false);
   }

   public void select(@NotNull Object[] elements, @Nullable Runnable onDone, boolean addToSelection, boolean deferred) {
      if (elements == null) {
         $$$reportNull$$$0(155);
      }

      this._select(elements, onDone, addToSelection, true, false, true, deferred, false, false);
   }

   void _select(@NotNull Object[] elements, Runnable onDone, boolean addToSelection, boolean checkIfInStructure) {
      if (elements == null) {
         $$$reportNull$$$0(156);
      }

      this._select(elements, onDone, addToSelection, true, checkIfInStructure, true, false, false, false);
   }

   void _select(@NotNull Object[] elements, @NotNull Runnable onDone) {
      if (elements == null) {
         $$$reportNull$$$0(157);
      }

      if (onDone == null) {
         $$$reportNull$$$0(158);
      }

      this._select(elements, onDone, false, true, true, false, false, false, false);
   }

   public void userSelect(@NotNull Object[] elements, Runnable onDone, boolean addToSelection, boolean scroll) {
      if (elements == null) {
         $$$reportNull$$$0(159);
      }

      this._select(elements, onDone, addToSelection, true, false, scroll, false, true, true);
   }

   void _select(@NotNull Object[] elements, Runnable onDone, boolean addToSelection, boolean checkCurrentSelection, boolean checkIfInStructure, boolean scrollToVisible, boolean deferred, boolean canSmartExpand, boolean mayQueue) {
      if (elements == null) {
         $$$reportNull$$$0(160);
      }

      this.assertIsDispatchThread();
      AbstractTreeUpdater updater = this.getUpdater();
      if (mayQueue && updater != null) {
         updater.queueSelection(new SelectionRequest(elements, onDone, addToSelection, checkCurrentSelection, checkIfInStructure, scrollToVisible, deferred, canSmartExpand));
      } else {
         boolean willAffectSelection = elements.length > 0 || addToSelection;
         if (!willAffectSelection) {
            this.runDone(onDone);
            this.maybeReady();
         } else {
            boolean oldCanProcessDeferredSelection = this.myCanProcessDeferredSelections;
            if (!deferred && this.wasRootNodeInitialized()) {
               this._getReady().doWhenDone(new 56(this, "AbstractTreeUi._select: on done getReady"));
            }

            if (this.checkDeferred(deferred, onDone)) {
               if (!deferred && oldCanProcessDeferredSelection && !this.myCanProcessDeferredSelections && !addToSelection) {
                  this.getTree().clearSelection();
               }

               this.runDone(new 57(this, "AbstractTreeUi._select", deferred, onDone, checkCurrentSelection, elements, scrollToVisible, addToSelection, checkIfInStructure, canSmartExpand));
            }
         }
      }
   }

   private void clearSelection() {
      this.mySelectionIsBeingAdjusted = true;

      try {
         this.myTree.clearSelection();
      } finally {
         this.mySelectionIsBeingAdjusted = false;
      }

   }

   boolean isSelectionBeingAdjusted() {
      return this.mySelectionIsBeingAdjusted;
   }

   private void restoreSelection(@NotNull Set<Object> selection) {
      if (selection == null) {
         $$$reportNull$$$0(161);
      }

      Iterator var2 = selection.iterator();

      while(var2.hasNext()) {
         Object each = var2.next();
         DefaultMutableTreeNode node = this.getNodeForElement(each, false);
         if (node != null && this.isValidForSelectionAdjusting(node)) {
            this.addSelectionPath(getPathFor(node), false, (Condition)null, (Object)null);
         }
      }

   }

   private void addToDeferred(@NotNull Object[] elementsToSelect, Runnable onDone, boolean addToSelection) {
      if (elementsToSelect == null) {
         $$$reportNull$$$0(162);
      }

      if (!addToSelection) {
         this.myDeferredSelections.clear();
      }

      this.myDeferredSelections.add(new 58(this, "AbstractTreeUi.addToDeferred", elementsToSelect, onDone, addToSelection));
   }

   private boolean checkDeferred(boolean isDeferred, @Nullable Runnable onDone) {
      if (isDeferred && !this.myCanProcessDeferredSelections && this.wasRootNodeInitialized()) {
         this.runDone(onDone);
         return false;
      } else {
         return true;
      }
   }

   @NotNull
   final Set<Object> getSelectedElements() {
      TreePath[] paths = this.myTree.getSelectionPaths();
      Set<Object> result = new LinkedHashSet();
      if (paths != null) {
         TreePath[] var3 = paths;
         int var4 = paths.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            TreePath eachPath = var3[var5];
            if (eachPath.getLastPathComponent() instanceof DefaultMutableTreeNode) {
               DefaultMutableTreeNode eachNode = (DefaultMutableTreeNode)eachPath.getLastPathComponent();
               if (eachNode != this.myRootNode || this.myTree.isRootVisible()) {
                  Object eachElement = this.getElementFor(eachNode);
                  if (eachElement != null) {
                     result.add(eachElement);
                  }
               }
            }
         }
      }

      if (result == null) {
         $$$reportNull$$$0(163);
      }

      return result;
   }

   private void addNext(@NotNull Object[] elements, int i, @Nullable Runnable onDone, int[] originalRows, boolean deferred, boolean scrollToVisible, boolean canSmartExpand) {
      if (elements == null) {
         $$$reportNull$$$0(164);
      }

      if (i >= elements.length) {
         if (this.myTree.isSelectionEmpty()) {
            this.myTree.setSelectionRows(originalRows);
         }

         this.runDone(onDone);
      } else {
         if (!this.checkDeferred(deferred, onDone)) {
            return;
         }

         this.doSelect(elements[i], new 59(this, "AbstractTreeUi.addNext", deferred, onDone, elements, i, originalRows, scrollToVisible, canSmartExpand), deferred, i == 0, scrollToVisible, canSmartExpand);
      }

   }

   public void select(@Nullable Object element, @Nullable Runnable onDone) {
      this.select(element, onDone, false);
   }

   public void select(@Nullable Object element, @Nullable Runnable onDone, boolean addToSelection) {
      if (element != null) {
         this._select(new Object[]{element}, onDone, addToSelection, false);
      }
   }

   private void doSelect(@NotNull Object element, Runnable onDone, boolean deferred, boolean canBeCentered, boolean scrollToVisible, boolean canSmartExpand) {
      if (element == null) {
         $$$reportNull$$$0(165);
      }

      Runnable _onDone = new 60(this, "AbstractTreeUi.doSelect", deferred, onDone, element, canBeCentered, scrollToVisible, canSmartExpand);
      this._expand(element, _onDone, true, false, canSmartExpand);
   }

   private void checkPathAndMaybeRevalidate(@NotNull Object element, @NotNull Runnable onDone, boolean parentsOnly, boolean canSmartExpand) {
      if (element == null) {
         $$$reportNull$$$0(166);
      }

      if (onDone == null) {
         $$$reportNull$$$0(167);
      }

      boolean toRevalidate = this.isValid(element) && !this.myRevalidatedObjects.contains(element) && this.getNodeForElement(element, false) == null && this.isInStructure(element);
      if (!toRevalidate) {
         this.runDone(onDone);
      } else {
         this.myRevalidatedObjects.add(element);
         this.getBuilder().revalidateElement(element).onSuccess((o) -> {
            this.invokeLaterIfNeeded(false, new 61(this, "AbstractTreeUi.checkPathAndMaybeRevalidate: on done revalidateElement", o, onDone, parentsOnly, canSmartExpand));
         }).onError((throwable) -> {
            this.wrapDone(onDone, "AbstractTreeUi.checkPathAndMaybeRevalidate: on rejected revalidateElement").run();
         });
      }
   }

   public void scrollSelectionToVisible(@Nullable Runnable onDone, boolean shouldBeCentered) {
      SwingUtilities.invokeLater(new 62(this, "AbstractTreeUi.scrollSelectionToVisible", onDone, shouldBeCentered));
   }

   private void selectVisible(@NotNull Object element, Runnable onDone, boolean addToSelection, boolean canBeCentered, boolean scroll) {
      if (element == null) {
         $$$reportNull$$$0(168);
      }

      DefaultMutableTreeNode toSelect = this.getNodeToScroll(element);
      if (toSelect == null) {
         this.runDone(onDone);
      } else {
         if (this.myUpdaterState != null) {
            this.myUpdaterState.addSelection(element);
         }

         this.setHoldSize(false);
         this.runDone(this.wrapScrollTo(onDone, element, toSelect, addToSelection, canBeCentered, scroll));
      }
   }

   void userScrollTo(Object element, Runnable onDone) {
      DefaultMutableTreeNode node = this.getNodeToScroll(element);
      this.runDone(node == null ? onDone : this.wrapScrollTo(onDone, element, node, false, true, true));
   }

   private DefaultMutableTreeNode getNodeToScroll(Object element) {
      if (element == null) {
         return null;
      } else {
         DefaultMutableTreeNode node = this.getNodeForElement(element, false);
         if (node == null) {
            return null;
         } else {
            return !this.myTree.isRootVisible() && node == this.getRootNode() ? null : node;
         }
      }
   }

   @NotNull
   private Runnable wrapDone(Runnable onDone, @NotNull String name) {
      if (name == null) {
         $$$reportNull$$$0(169);
      }

      return new 63(this, name, onDone);
   }

   @NotNull
   private Runnable wrapScrollTo(Runnable onDone, @NotNull Object element, @NotNull DefaultMutableTreeNode node, boolean addToSelection, boolean canBeCentered, boolean scroll) {
      if (element == null) {
         $$$reportNull$$$0(170);
      }

      if (node == null) {
         $$$reportNull$$$0(171);
      }

      return new 64(this, "AbstractTreeUi.wrapScrollTo", element, node, canBeCentered, addToSelection, scroll, onDone);
   }

   private int getRowIfUnderSelection(@NotNull Object element) {
      if (element == null) {
         $$$reportNull$$$0(172);
      }

      Set<Object> selection = this.getSelectedElements();
      if (selection.contains(element)) {
         TreePath[] paths = this.getTree().getSelectionPaths();
         TreePath[] var12 = paths;
         int var13 = paths.length;

         for(int var14 = 0; var14 < var13; ++var14) {
            TreePath each = var12[var14];
            if (element.equals(this.getElementFor(each.getLastPathComponent()))) {
               return this.getTree().getRowForPath(each);
            }
         }

         return -1;
      } else {
         Object anchor = TreeAnchorizer.getService().createAnchor(element);
         Object o = isNodeNull(anchor) ? null : this.myElementToNodeMap.get(anchor);
         TreeAnchorizer.getService().freeAnchor(anchor);
         if (o instanceof List) {
            TreePath[] paths = this.getTree().getSelectionPaths();
            if (paths != null && paths.length > 0) {
               Set<DefaultMutableTreeNode> selectedNodes = new HashSet();
               TreePath[] var7 = paths;
               int var8 = paths.length;

               for(int var9 = 0; var9 < var8; ++var9) {
                  TreePath eachPAth = var7[var9];
                  if (eachPAth.getLastPathComponent() instanceof DefaultMutableTreeNode) {
                     selectedNodes.add((DefaultMutableTreeNode)eachPAth.getLastPathComponent());
                  }
               }

               Iterator var15 = ((List)o).iterator();

               while(var15.hasNext()) {
                  for(DefaultMutableTreeNode eachNode = (DefaultMutableTreeNode)var15.next(); eachNode != null; eachNode = (DefaultMutableTreeNode)eachNode.getParent()) {
                     if (selectedNodes.contains(eachNode)) {
                        return this.getTree().getRowForPath(getPathFor(eachNode));
                     }
                  }
               }
            }
         }

         return -1;
      }
   }

   public void expandAll(@Nullable Runnable onDone) {
      JTree tree = this.getTree();
      if (tree.getRowCount() > 0) {
         int expandRecursionDepth = Math.max(2, Registry.intValue("ide.tree.expandRecursionDepth"));
         (new 65(this, "AbstractTreeUi.expandAll", expandRecursionDepth, tree, onDone)).run();
      } else {
         this.runDone(onDone);
      }

   }

   public void expand(Object element, @Nullable Runnable onDone) {
      this.expand(new Object[]{element}, onDone);
   }

   public void expand(@NotNull Object[] element, @Nullable Runnable onDone) {
      if (element == null) {
         $$$reportNull$$$0(173);
      }

      this.expand(element, onDone, false);
   }

   void expand(@NotNull Object[] element, @Nullable Runnable onDone, boolean checkIfInStructure) {
      if (element == null) {
         $$$reportNull$$$0(174);
      }

      this._expand(element, (Runnable)(onDone == null ? new EmptyRunnable() : onDone), checkIfInStructure);
   }

   private void _expand(@NotNull Object[] elements, @NotNull Runnable onDone, boolean checkIfInStructure) {
      if (elements == null) {
         $$$reportNull$$$0(175);
      }

      if (onDone == null) {
         $$$reportNull$$$0(176);
      }

      try {
         this.runDone(new 66(this, "AbstractTreeUi._expand", elements, onDone, checkIfInStructure));
      } catch (ProcessCanceledException var7) {
         try {
            this.runDone(onDone);
         } catch (ProcessCanceledException var6) {
         }
      }

   }

   private void expandNext(@NotNull Object[] elements, int index, boolean parentsOnly, boolean checkIfInStricture, boolean canSmartExpand, @NotNull ActionCallback done, int currentDepth) {
      if (elements == null) {
         $$$reportNull$$$0(177);
      }

      if (done == null) {
         $$$reportNull$$$0(178);
      }

      if (elements.length <= 0) {
         done.setDone();
      } else if (index < elements.length) {
         int[] actualDepth = new int[]{currentDepth};
         boolean breakCallChain = false;
         if (actualDepth[0] > Registry.intValue("ide.tree.expandRecursionDepth")) {
            actualDepth[0] = 0;
            breakCallChain = true;
         }

         Runnable expandRunnable = new 67(this, "AbstractTreeUi.expandNext", elements, index, done, parentsOnly, checkIfInStricture, canSmartExpand, actualDepth);
         if (breakCallChain && !this.isPassthroughMode()) {
            SwingUtilities.invokeLater(expandRunnable);
         } else {
            expandRunnable.run();
         }

      }
   }

   public void collapseChildren(@NotNull Object element, @Nullable Runnable onDone) {
      if (element == null) {
         $$$reportNull$$$0(179);
      }

      this.runDone(new 68(this, "AbstractTreeUi.collapseChildren", element, onDone));
   }

   private void runDone(@Nullable Runnable done) {
      if (done != null) {
         if (this.canInitiateNewActivity() || !(done instanceof UserRunnable)) {
            if (this.isYeildingNow()) {
               this.myYieldingDoneRunnables.add(done);
            } else {
               try {
                  this.execute(done);
               } catch (ProcessCanceledException var3) {
               }
            }

         }
      }
   }

   private void _expand(Object element, @NotNull Runnable onDone, boolean parentsOnly, boolean checkIfInStructure, boolean canSmartExpand) {
      if (onDone == null) {
         $$$reportNull$$$0(180);
      }

      if (checkIfInStructure && !this.isInStructure(element)) {
         this.runDone(onDone);
      } else {
         if (this.wasRootNodeInitialized()) {
            List<Object> kidsToExpand = new ArrayList();
            Object eachElement = element;
            DefaultMutableTreeNode firstVisible = null;

            while(eachElement != null && this.isValid(eachElement)) {
               int preselected = this.getRowIfUnderSelection(eachElement);
               if (preselected >= 0) {
                  firstVisible = (DefaultMutableTreeNode)this.getTree().getPathForRow(preselected).getLastPathComponent();
               } else {
                  firstVisible = this.getNodeForElement(eachElement, true);
               }

               if (eachElement != element || !parentsOnly) {
                  kidsToExpand.add(eachElement);
               }

               if (firstVisible != null) {
                  break;
               }

               eachElement = this.getTreeStructure().getParentElement(eachElement);
               if (eachElement == null) {
                  break;
               }

               int i = kidsToExpand.indexOf(eachElement);
               if (i != -1) {
                  try {
                     Object existing = kidsToExpand.get(i);
                     LOG.error("Tree path contains equal elements at different levels:\n element: '" + eachElement + "'; " + eachElement.getClass() + " (" + System.identityHashCode(eachElement) + ");\nexisting: '" + existing + "'; " + existing.getClass() + " (" + System.identityHashCode(existing) + "); path='" + kidsToExpand + "'; tree structure=" + this.myTreeStructure);
                  } catch (AssertionError var12) {
                  }

                  this.runDone(onDone);
                  throw new ProcessCanceledException();
               }
            }

            if (firstVisible == null) {
               this.runDone(onDone);
            } else if (kidsToExpand.isEmpty()) {
               DefaultMutableTreeNode parentNode = (DefaultMutableTreeNode)firstVisible.getParent();
               if (parentNode != null) {
                  TreePath parentPath = new TreePath(parentNode.getPath());
                  if (!this.myTree.isExpanded(parentPath)) {
                     this.expand(parentPath, canSmartExpand);
                  }
               }

               this.runDone(onDone);
            } else {
               this.processExpand(firstVisible, kidsToExpand, kidsToExpand.size() - 1, onDone, canSmartExpand);
            }
         } else {
            this.deferExpansion(element, onDone, parentsOnly, canSmartExpand);
         }

      }
   }

   private void deferExpansion(Object element, @NotNull Runnable onDone, boolean parentsOnly, boolean canSmartExpand) {
      if (onDone == null) {
         $$$reportNull$$$0(181);
      }

      this.myDeferredExpansions.add(new 69(this, "AbstractTreeUi.deferExpansion", element, onDone, parentsOnly, canSmartExpand));
   }

   private void processExpand(DefaultMutableTreeNode toExpand, @NotNull List<Object> kidsToExpand, int expandIndex, @NotNull Runnable onDone, boolean canSmartExpand) {
      if (kidsToExpand == null) {
         $$$reportNull$$$0(182);
      }

      if (onDone == null) {
         $$$reportNull$$$0(183);
      }

      Object element = this.getElementFor(toExpand);
      if (element == null) {
         this.runDone(onDone);
      } else {
         this.addNodeAction(element, true, (node) -> {
            if (node.getChildCount() > 0 && !this.myTree.isExpanded(new TreePath(node.getPath())) && !this.isAutoExpand(node)) {
               this.expand(node, canSmartExpand);
            }

            if (expandIndex <= 0) {
               this.runDone(onDone);
            } else {
               this.checkPathAndMaybeRevalidate(kidsToExpand.get(expandIndex - 1), new 70(this, "AbstractTreeUi.processExpand", kidsToExpand, expandIndex, onDone, canSmartExpand), false, canSmartExpand);
            }
         });
         boolean childrenToUpdate = this.areChildrenToBeUpdated(toExpand);
         boolean expanded = this.myTree.isExpanded(getPathFor(toExpand));
         boolean unbuilt = this.myUnbuiltNodes.contains(toExpand);
         if (expanded) {
            if (unbuilt || childrenToUpdate) {
               this.addSubtreeToUpdate(toExpand);
            }
         } else {
            this.expand(toExpand, canSmartExpand);
         }

         if (!unbuilt && !childrenToUpdate) {
            this.processNodeActionsIfReady(toExpand);
         }

      }
   }

   private boolean areChildrenToBeUpdated(DefaultMutableTreeNode node) {
      return this.getUpdater().isEnqueuedToUpdate(node) || this.isUpdatingParent(node) || this.myCancelledBuild.containsKey(node);
   }

   @Nullable
   public Object getElementFor(Object node) {
      NodeDescriptor descriptor = getDescriptorFrom(node);
      return descriptor == null ? null : this.getElementFromDescriptor(descriptor);
   }

   final boolean isNodeBeingBuilt(@NotNull TreePath path) {
      if (path == null) {
         $$$reportNull$$$0(184);
      }

      return this.isNodeBeingBuilt(path.getLastPathComponent());
   }

   private boolean isNodeBeingBuilt(@NotNull Object node) {
      if (node == null) {
         $$$reportNull$$$0(185);
      }

      return this.getParentBuiltNode(node) != null || this.myRootNode == node && !this.wasRootNodeInitialized();
   }

   @Nullable
   private DefaultMutableTreeNode getParentBuiltNode(@NotNull Object node) {
      if (node == null) {
         $$$reportNull$$$0(186);
      }

      DefaultMutableTreeNode parent = this.getParentLoadingInBackground(node);
      if (parent != null) {
         return parent;
      } else if (this.isLoadingParentInBackground(node)) {
         return (DefaultMutableTreeNode)node;
      } else {
         DefaultMutableTreeNode treeNode = (DefaultMutableTreeNode)node;
         boolean childrenAreNoLoadedYet = this.myUnbuiltNodes.contains(treeNode) || this.isUpdatingChildrenNow(treeNode);
         if (childrenAreNoLoadedYet) {
            TreePath nodePath = new TreePath(treeNode.getPath());
            return !this.myTree.isExpanded(nodePath) ? null : (DefaultMutableTreeNode)node;
         } else {
            return null;
         }
      }
   }

   private boolean isLoadingParentInBackground(Object node) {
      return node instanceof DefaultMutableTreeNode && this.isLoadedInBackground(this.getElementFor(node));
   }

   public void setTreeStructure(@NotNull AbstractTreeStructure treeStructure) {
      if (treeStructure == null) {
         $$$reportNull$$$0(187);
      }

      this.myTreeStructure = treeStructure;
      this.clearUpdaterState();
   }

   public AbstractTreeUpdater getUpdater() {
      return this.myUpdater;
   }

   public void setUpdater(@Nullable AbstractTreeUpdater updater) {
      this.myUpdater = updater;
      if (updater != null && this.myUpdateIfInactive) {
         updater.showNotify();
      }

      if (this.myUpdater != null) {
         this.myUpdater.setPassThroughMode(this.myPassThroughMode);
      }

   }

   public DefaultMutableTreeNode getRootNode() {
      return this.myRootNode;
   }

   public void setRootNode(@NotNull DefaultMutableTreeNode rootNode) {
      if (rootNode == null) {
         $$$reportNull$$$0(188);
      }

      this.myRootNode = rootNode;
   }

   private void dropUpdaterStateIfExternalChange() {
      if (!this.isInnerChange()) {
         this.clearUpdaterState();
         this.myAutoExpandRoots.clear();
         this.mySelectionIsAdjusted = false;
      }

   }

   void clearUpdaterState() {
      this.myUpdaterState = null;
   }

   private void createMapping(@NotNull Object element, DefaultMutableTreeNode node) {
      if (element == null) {
         $$$reportNull$$$0(189);
      }

      element = TreeAnchorizer.getService().createAnchor(element);
      this.warnMap("myElementToNodeMap: createMapping: ", this.myElementToNodeMap);
      if (!this.myElementToNodeMap.containsKey(element)) {
         this.myElementToNodeMap.put(element, node);
      } else {
         Object value = this.myElementToNodeMap.get(element);
         Object nodes;
         if (value instanceof DefaultMutableTreeNode) {
            nodes = new ArrayList();
            ((List)nodes).add((DefaultMutableTreeNode)value);
            this.myElementToNodeMap.put(element, nodes);
         } else {
            nodes = (List)value;
         }

         ((List)nodes).add(node);
      }

   }

   private void removeMapping(@NotNull Object element, DefaultMutableTreeNode node, @Nullable Object elementToPutNodeActionsFor) {
      if (element == null) {
         $$$reportNull$$$0(190);
      }

      element = TreeAnchorizer.getService().createAnchor(element);
      this.warnMap("myElementToNodeMap: removeMapping: ", this.myElementToNodeMap);
      Object value = this.myElementToNodeMap.get(element);
      if (value != null) {
         if (value instanceof DefaultMutableTreeNode) {
            if (value.equals(node)) {
               this.myElementToNodeMap.remove(element);
            }
         } else {
            List<DefaultMutableTreeNode> nodes = (List)value;
            boolean reallyRemoved = nodes.remove(node);
            if (reallyRemoved && nodes.isEmpty()) {
               this.myElementToNodeMap.remove(element);
            }
         }
      }

      this.remapNodeActions(element, elementToPutNodeActionsFor);
      TreeAnchorizer.getService().freeAnchor(element);
   }

   private void remapNodeActions(Object element, Object elementToPutNodeActionsFor) {
      _remapNodeActions(element, elementToPutNodeActionsFor, this.myNodeActions);
      _remapNodeActions(element, elementToPutNodeActionsFor, this.myNodeChildrenActions);
      this.warnMap("myNodeActions: remapNodeActions: ", this.myNodeActions);
      this.warnMap("myNodeChildrenActions: remapNodeActions: ", this.myNodeChildrenActions);
   }

   private static void _remapNodeActions(Object element, @Nullable Object elementToPutNodeActionsFor, @NotNull Map<Object, List<com.intellij.ide.util.treeView.AbstractTreeUi.NodeAction>> nodeActions) {
      if (nodeActions == null) {
         $$$reportNull$$$0(191);
      }

      List<com.intellij.ide.util.treeView.AbstractTreeUi.NodeAction> actions = (List)nodeActions.get(element);
      nodeActions.remove(element);
      if (elementToPutNodeActionsFor != null && actions != null) {
         nodeActions.put(elementToPutNodeActionsFor, actions);
      }

   }

   @Nullable
   private DefaultMutableTreeNode getFirstNode(@NotNull Object element) {
      if (element == null) {
         $$$reportNull$$$0(192);
      }

      return this.findNode(element, 0);
   }

   @Nullable
   private DefaultMutableTreeNode findNode(@NotNull Object element, int startIndex) {
      if (element == null) {
         $$$reportNull$$$0(193);
      }

      Object value = this.getBuilder().findNodeByElement(element);
      if (value == null) {
         return null;
      } else if (value instanceof DefaultMutableTreeNode) {
         return startIndex == 0 ? (DefaultMutableTreeNode)value : null;
      } else {
         List<DefaultMutableTreeNode> nodes = (List)value;
         return startIndex < nodes.size() ? (DefaultMutableTreeNode)nodes.get(startIndex) : null;
      }
   }

   Object findNodeByElement(Object element) {
      element = TreeAnchorizer.getService().createAnchor(element);

      Object var2;
      try {
         if (!isNodeNull(element)) {
            if (this.myElementToNodeMap.containsKey(element)) {
               var2 = this.myElementToNodeMap.get(element);
               return var2;
            }

            this.TREE_NODE_WRAPPER.setValue(element);
            var2 = this.myElementToNodeMap.get(this.TREE_NODE_WRAPPER);
            return var2;
         }

         var2 = null;
      } finally {
         this.TREE_NODE_WRAPPER.setValue((Object)null);
         TreeAnchorizer.getService().freeAnchor(element);
      }

      return var2;
   }

   @Nullable
   private DefaultMutableTreeNode findNodeForChildElement(@NotNull DefaultMutableTreeNode parentNode, Object element) {
      if (parentNode == null) {
         $$$reportNull$$$0(194);
      }

      Object anchor = TreeAnchorizer.getService().createAnchor(element);
      Object value = isNodeNull(anchor) ? null : this.myElementToNodeMap.get(anchor);
      TreeAnchorizer.getService().freeAnchor(anchor);
      if (value == null) {
         return null;
      } else if (value instanceof DefaultMutableTreeNode) {
         DefaultMutableTreeNode elementNode = (DefaultMutableTreeNode)value;
         return parentNode.equals(elementNode.getParent()) ? elementNode : null;
      } else {
         List<DefaultMutableTreeNode> allNodesForElement = (List)value;
         Iterator var6 = allNodesForElement.iterator();

         DefaultMutableTreeNode elementNode;
         do {
            if (!var6.hasNext()) {
               return null;
            }

            elementNode = (DefaultMutableTreeNode)var6.next();
         } while(!parentNode.equals(elementNode.getParent()));

         return elementNode;
      }
   }

   private void addNodeAction(Object element, boolean shouldChildrenBeReady, @NotNull com.intellij.ide.util.treeView.AbstractTreeUi.NodeAction action) {
      if (action == null) {
         $$$reportNull$$$0(195);
      }

      this._addNodeAction(element, action, this.myNodeActions);
      if (shouldChildrenBeReady) {
         this._addNodeAction(element, action, this.myNodeChildrenActions);
      }

      this.warnMap("myNodeActions: addNodeAction: ", this.myNodeActions);
      this.warnMap("myNodeChildrenActions: addNodeAction: ", this.myNodeChildrenActions);
   }

   public void addActivity() {
      if (this.myActivityMonitor != null) {
         this.myActivityMonitor.addActivity(this.myActivityId, this.getUpdater().getModalityState());
      }

   }

   private void removeActivity() {
      if (this.myActivityMonitor != null) {
         this.myActivityMonitor.removeActivity(this.myActivityId);
      }

   }

   private void _addNodeAction(Object element, com.intellij.ide.util.treeView.AbstractTreeUi.NodeAction action, @NotNull Map<Object, List<com.intellij.ide.util.treeView.AbstractTreeUi.NodeAction>> map) {
      if (map == null) {
         $$$reportNull$$$0(196);
      }

      this.maybeSetBusyAndScheduleWaiterForReady(true, element);
      ((List)map.computeIfAbsent(element, (k) -> {
         return new ArrayList();
      })).add(action);
      this.addActivity();
   }

   private void cleanUpNow() {
      if (this.canInitiateNewActivity()) {
         UpdaterTreeState state = new UpdaterTreeState(this);
         this.myTree.collapsePath(new TreePath(this.myTree.getModel().getRoot()));
         this.clearSelection();
         this.getRootNode().removeAllChildren();
         this.myRootNodeWasQueuedToInitialize = false;
         this.myRootNodeInitialized = false;
         this.clearNodeActions();
         this.myElementToNodeMap.clear();
         this.myDeferredSelections.clear();
         this.myDeferredExpansions.clear();
         this.myLoadedInBackground.clear();
         this.myUnbuiltNodes.clear();
         this.myUpdateFromRootRequested = true;
         this.myWorker.clear();
         this.myTree.invalidate();
         state.restore((DefaultMutableTreeNode)null);
      }
   }

   public void setClearOnHideDelay(long clearOnHideDelay) {
      this.myClearOnHideDelay = clearOnHideDelay;
   }

   private void removeChildren(@NotNull DefaultMutableTreeNode node) {
      if (node == null) {
         $$$reportNull$$$0(197);
      }

      Enumeration<DefaultMutableTreeNode> children = node.children();
      Iterator var3 = Collections.list(children).iterator();

      while(var3.hasNext()) {
         DefaultMutableTreeNode child = (DefaultMutableTreeNode)var3.next();
         this.disposeNode(child);
      }

      node.removeAllChildren();
      this.nodeStructureChanged(node);
   }

   private void maybeUpdateSubtreeToUpdate(@NotNull DefaultMutableTreeNode subtreeRoot) {
      if (subtreeRoot == null) {
         $$$reportNull$$$0(198);
      }

      if (this.myUnbuiltNodes.contains(subtreeRoot)) {
         TreePath path = getPathFor(subtreeRoot);
         if (this.myTree.getRowForPath(path) != -1) {
            DefaultMutableTreeNode parent = this.getParentBuiltNode(subtreeRoot);
            if (parent == null) {
               if (!this.getBuilder().isAlwaysShowPlus(getDescriptorFrom(subtreeRoot))) {
                  this.addSubtreeToUpdate(subtreeRoot);
               }
            } else if (parent != subtreeRoot) {
               this.addNodeAction(this.getElementFor(subtreeRoot), true, (parent1) -> {
                  this.maybeUpdateSubtreeToUpdate(subtreeRoot);
               });
            }

         }
      }
   }

   private boolean isSelectionInside(@NotNull DefaultMutableTreeNode parent) {
      if (parent == null) {
         $$$reportNull$$$0(199);
      }

      TreePath path = new TreePath(this.myTreeModel.getPathToRoot(parent));
      TreePath[] paths = this.myTree.getSelectionPaths();
      if (paths == null) {
         return false;
      } else {
         TreePath[] var4 = paths;
         int var5 = paths.length;

         for(int var6 = 0; var6 < var5; ++var6) {
            TreePath path1 = var4[var6];
            if (path.isDescendant(path1)) {
               return true;
            }
         }

         return false;
      }
   }

   boolean isInStructure(@Nullable Object element) {
      if (isNodeNull(element)) {
         return false;
      } else {
         AbstractTreeStructure structure = this.getTreeStructure();
         if (structure == null) {
            return false;
         } else {
            Object rootElement = structure.getRootElement();

            for(Object eachParent = element; eachParent != null; eachParent = structure.getParentElement(eachParent)) {
               if (Comparing.equal(rootElement, eachParent)) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   void setCanYield(boolean canYield) {
      this.myCanYield = canYield;
   }

   @NotNull
   Collection<TreeUpdatePass> getYeildingPasses() {
      List var10000 = this.myYieldingPasses;
      if (var10000 == null) {
         $$$reportNull$$$0(200);
      }

      return var10000;
   }

   private long getComparatorStamp() {
      if (this.myNodeDescriptorComparator instanceof NodeComparator) {
         long currentComparatorStamp = ((NodeComparator)this.myNodeDescriptorComparator).getStamp();
         if (currentComparatorStamp > this.myLastComparatorStamp) {
            this.myOwnComparatorStamp = Math.max(this.myOwnComparatorStamp, currentComparatorStamp) + 1L;
         }

         this.myLastComparatorStamp = currentComparatorStamp;
         return Math.max(currentComparatorStamp, this.myOwnComparatorStamp);
      } else {
         return this.myOwnComparatorStamp;
      }
   }

   void incComparatorStamp() {
      this.myOwnComparatorStamp = this.getComparatorStamp() + 1L;
   }

   void setPassthroughMode(boolean passthrough) {
      this.myPassThroughMode = passthrough;
      AbstractTreeUpdater updater = this.getUpdater();
      if (updater != null) {
         updater.setPassThroughMode(this.myPassThroughMode);
      }

      if (!isUnitTestingMode() && passthrough) {
      }

   }

   boolean isPassthroughMode() {
      return this.myPassThroughMode;
   }

   private static boolean isUnitTestingMode() {
      Application app = ApplicationManager.getApplication();
      return app != null && app.isUnitTestMode();
   }

   private void addModelListenerToDiagnoseAccessOutsideEdt() {
      this.myTreeModel.addTreeModelListener(new 71(this));
   }

   private <V> void warnMap(String prefix, Map<Object, V> map) {
      if (LOG.isDebugEnabled()) {
         if (!SwingUtilities.isEventDispatchThread() && !this.myPassThroughMode) {
            LOG.warn(prefix + "modified on wrong thread");
         }

         long count = map.keySet().stream().filter(AbstractTreeUi::isNodeNull).count();
         if (count > 0L) {
            LOG.warn(prefix + "null keys: " + count + " / " + map.size());
         }

      }
   }

   private static boolean isNodeNull(Object element) {
      if (element instanceof AbstractTreeNode) {
         AbstractTreeNode node = (AbstractTreeNode)element;
         element = node.getValue();
      }

      return element == null;
   }

   public final boolean isConsistent() {
      return this.myTree != null && this.myTreeModel != null && this.myTreeModel == this.myTree.getModel();
   }

   // $FF: synthetic method
   static NodeDescriptor access$000(Object x0) {
      return getDescriptorFrom(x0);
   }

   // $FF: synthetic method
   static Comparator access$100(AbstractTreeUi x0) {
      return x0.myNodeDescriptorComparator;
   }

   // $FF: synthetic method
   static void access$200(AbstractTreeUi x0, boolean x1, Object x2) {
      x0.maybeSetBusyAndScheduleWaiterForReady(x1, x2);
   }

   // $FF: synthetic method
   static void access$300(AbstractTreeUi x0) {
      x0.removeActivity();
   }

   // $FF: synthetic method
   static DefaultMutableTreeNode access$400(AbstractTreeUi x0) {
      return x0.myRootNode;
   }

   // $FF: synthetic method
   static void access$500(AbstractTreeUi x0, DefaultMutableTreeNode x1, boolean x2) {
      x0.insertLoadingNode(x1, x2);
   }

   // $FF: synthetic method
   static boolean access$802(AbstractTreeUi x0, boolean x1) {
      return x0.myShowing = x1;
   }

   // $FF: synthetic method
   static boolean access$902(AbstractTreeUi x0, boolean x1) {
      return x0.myWasEverShown = x1;
   }

   // $FF: synthetic method
   static boolean access$1000(AbstractTreeUi x0) {
      return x0.canInitiateNewActivity();
   }

   // $FF: synthetic method
   static SimpleTimerTask access$1102(AbstractTreeUi x0, SimpleTimerTask x1) {
      return x0.myCleanupTask = x1;
   }

   // $FF: synthetic method
   static void access$1200(AbstractTreeUi x0) {
      x0.cleanUpNow();
   }

   // $FF: synthetic method
   static void access$1300(AbstractTreeUi x0) {
      x0.cleanUpAll();
   }

   // $FF: synthetic method
   static void access$1400(AbstractTreeUi x0) {
      x0.releaseNow();
   }

   // $FF: synthetic method
   static Promise access$1500(AbstractTreeUi x0, NodeDescriptor x1, boolean x2) {
      return x0.update(x1, x2);
   }

   // $FF: synthetic method
   static boolean access$1600(Object x0) {
      return isNodeNull(x0);
   }

   // $FF: synthetic method
   static void access$1700(AbstractTreeUi x0, Object x1, DefaultMutableTreeNode x2) {
      x0.createMapping(x1, x2);
   }

   // $FF: synthetic method
   static boolean access$1800(AbstractTreeUi x0, NodeDescriptor x1) {
      return x0.isAutoExpand(x1);
   }

   // $FF: synthetic method
   static Set access$1900(AbstractTreeUi x0) {
      return x0.myUnbuiltNodes;
   }

   // $FF: synthetic method
   static void access$2000(AbstractTreeUi x0, DefaultMutableTreeNode x1, boolean x2) {
      x0.expand(x1, x2);
   }

   // $FF: synthetic method
   static ActionCallback access$2100(AbstractTreeUi x0, DefaultMutableTreeNode x1, TreeUpdatePass x2, com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren x3, boolean x4, boolean x5, boolean x6, boolean x7, boolean x8) {
      return x0.updateNodeChildren(x1, x2, x3, x4, x5, x6, x7, x8);
   }

   // $FF: synthetic method
   static DefaultTreeModel access$2200(AbstractTreeUi x0) {
      return x0.myTreeModel;
   }

   // $FF: synthetic method
   static boolean access$2302(AbstractTreeUi x0, boolean x1) {
      return x0.myRootNodeInitialized = x1;
   }

   // $FF: synthetic method
   static void access$2400(AbstractTreeUi x0, DefaultMutableTreeNode x1) {
      x0.processNodeActionsIfReady(x1);
   }

   // $FF: synthetic method
   static boolean access$2500(AbstractTreeUi x0, NodeDescriptor x1) {
      return x0.update(x1);
   }

   // $FF: synthetic method
   static void access$2600(AbstractTreeUi x0, Runnable x1) throws ProcessCanceledException {
      x0.execute(x1);
   }

   // $FF: synthetic method
   static Promise access$2700(AbstractTreeUi x0, com.intellij.ide.util.treeView.AbstractTreeUi.AsyncRunnable x1, TreeUpdatePass x2, DefaultMutableTreeNode x3) {
      return x0.maybeYield(x1, x2, x3);
   }

   // $FF: synthetic method
   static void access$2800(AbstractTreeUi x0, int x1, TreeUpdatePass x2) {
      x0.updateRow(x1, x2);
   }

   // $FF: synthetic method
   static void access$2900(AbstractTreeUi x0, DefaultMutableTreeNode x1) {
      x0.removeFromCancelled(x1);
   }

   // $FF: synthetic method
   static void access$3000(AbstractTreeUi x0, DefaultMutableTreeNode x1, TreeUpdatePass x2, com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren x3, boolean x4, boolean x5, boolean x6, boolean x7, boolean x8) {
      x0.doUpdateChildren(x1, x2, x3, x4, x5, x6, x7, x8);
   }

   // $FF: synthetic method
   static boolean access$3100(AbstractTreeUi x0, DefaultMutableTreeNode x1) {
      return x0.processAlwaysLeaf(x1);
   }

   // $FF: synthetic method
   static void access$3200(AbstractTreeUi x0, DefaultMutableTreeNode x1, TreeUpdatePass x2, com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren x3, boolean x4, boolean x5, boolean x6) {
      x0.updateNodeChildrenNow(x1, x2, x3, x4, x5, x6);
   }

   // $FF: synthetic method
   static void access$3300(AbstractTreeUi x0, MutableTreeNode x1, boolean x2) {
      x0.removeNodeFromParent(x1, x2);
   }

   // $FF: synthetic method
   static void access$3400(AbstractTreeUi x0, DefaultMutableTreeNode x1) {
      x0.disposeNode(x1);
   }

   // $FF: synthetic method
   static void access$3500(AbstractTreeUi x0, DefaultMutableTreeNode x1) {
      x0.removeFromUpdatingChildren(x1);
   }

   // $FF: synthetic method
   static boolean access$3600(AbstractTreeUi x0, DefaultMutableTreeNode x1) {
      return x0.isDisposed(x1);
   }

   // $FF: synthetic method
   static void access$3700(AbstractTreeUi x0, DefaultMutableTreeNode x1, boolean x2) {
      x0.removeLoading(x1, x2);
   }

   // $FF: synthetic method
   static boolean access$3800(AbstractTreeUi x0, DefaultMutableTreeNode x1, boolean x2) {
      return x0.isExpanded(x1, x2);
   }

   // $FF: synthetic method
   static Set access$3900(AbstractTreeUi x0) {
      return x0.myWillBeExpanded;
   }

   // $FF: synthetic method
   static AsyncResult access$4000(AbstractTreeUi x0, NodeDescriptor x1, MutualMap x2, DefaultMutableTreeNode x3, boolean x4, com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren x5) {
      return x0.collectNodesToInsert(x1, x2, x3, x4, x5);
   }

   // $FF: synthetic method
   static void access$4100(AbstractTreeUi x0, List x1, DefaultMutableTreeNode x2) {
      x0.insertNodesInto(x1, x2);
   }

   // $FF: synthetic method
   static boolean access$4200(AbstractTreeUi x0, DefaultMutableTreeNode x1, boolean x2, boolean x3) {
      return x0.isChildNodeForceUpdate(x1, x2, x3);
   }

   // $FF: synthetic method
   static ActionCallback access$4300(AbstractTreeUi x0, List x1, TreeUpdatePass x2, boolean x3, boolean x4) {
      return x0.updateNodesToInsert(x1, x2, x3, x4);
   }

   // $FF: synthetic method
   static void access$4400(AbstractTreeUi x0, Object x1, boolean x2, com.intellij.ide.util.treeView.AbstractTreeUi.NodeAction x3) {
      x0.addNodeAction(x1, x2, x3);
   }

   // $FF: synthetic method
   static void access$4500(AbstractTreeUi x0, DefaultMutableTreeNode x1) {
      x0.addToUpdatingChildren(x1);
   }

   // $FF: synthetic method
   static Object[] access$4600(AbstractTreeUi x0, Object x1) {
      return x0.getChildrenFor(x1);
   }

   // $FF: synthetic method
   static void access$4700(AbstractTreeUi x0, DefaultMutableTreeNode x1) {
      x0.removeFromUnbuilt(x1);
   }

   // $FF: synthetic method
   static boolean access$4800(AbstractTreeUi x0, DefaultMutableTreeNode x1) {
      return x0.isAutoExpand(x1);
   }

   // $FF: synthetic method
   static boolean access$4900(AbstractTreeUi x0, TreeUpdatePass x1) {
      return x0.isRerunNeeded(x1);
   }

   // $FF: synthetic method
   static void access$5000(AbstractTreeUi x0, Runnable x1) {
      x0.runDone(x1);
   }

   // $FF: synthetic method
   static Promise access$5100(AbstractTreeUi x0, com.intellij.ide.util.treeView.AbstractTreeUi.AsyncRunnable x1) throws ProcessCanceledException {
      return x0.execute(x1);
   }

   // $FF: synthetic method
   static AtomicBoolean access$5200(AbstractTreeUi x0) {
      return x0.myResettingToReadyNow;
   }

   // $FF: synthetic method
   static Map access$5300(AbstractTreeUi x0) {
      return x0.myBatchIndicators;
   }

   // $FF: synthetic method
   static Map access$5400(AbstractTreeUi x0) {
      return x0.myBatchCallbacks;
   }

   // $FF: synthetic method
   static ActionCallback access$5500(AbstractTreeUi x0) {
      return x0.resetToReadyNow();
   }

   // $FF: synthetic method
   static void access$5600(AbstractTreeUi x0, boolean x1) {
      x0.setCancelRequested(x1);
   }

   // $FF: synthetic method
   static void access$5700(AbstractTreeUi x0, Runnable x1, TreeUpdatePass x2) {
      x0.executeYieldingRequest(x1, x2);
   }

   // $FF: synthetic method
   static void access$5800(AbstractTreeUi x0, DefaultMutableTreeNode x1) {
      x0.addToUnbuilt(x1);
   }

   // $FF: synthetic method
   static ActionCallback access$5900(AbstractTreeUi x0) {
      return x0._getReady();
   }

   // $FF: synthetic method
   static void access$6000(AbstractTreeUi x0, Object x1) {
      x0.removeFromLoadedInBackground(x1);
   }

   // $FF: synthetic method
   static boolean access$6100(AbstractTreeUi x0, NodeDescriptor x1, NodeDescriptor x2) {
      return x0.isValid(x1, x2);
   }

   // $FF: synthetic method
   static Logger access$6200() {
      return LOG;
   }

   // $FF: synthetic method
   static Pair access$6300(AbstractTreeUi x0, DefaultMutableTreeNode x1, NodeDescriptor x2, TreeUpdatePass x3, boolean x4, com.intellij.ide.util.treeView.AbstractTreeUi.LoadedChildren x5) {
      return x0.processUnbuilt(x1, x2, x3, x4, x5);
   }

   // $FF: synthetic method
   static boolean access$6400(AbstractTreeUi x0, TreeNode x1) {
      return x0.isValidForSelectionAdjusting(x1);
   }

   // $FF: synthetic method
   static boolean access$6502(AbstractTreeUi x0, boolean x1) {
      return x0.mySelectionIsAdjusted = x1;
   }

   // $FF: synthetic method
   static UpdaterTreeState access$6600(AbstractTreeUi x0) {
      return x0.myUpdaterState;
   }

   // $FF: synthetic method
   static TreePath access$6700(TreeNode x0) {
      return getPathFor(x0);
   }

   // $FF: synthetic method
   static Set access$6800(AbstractTreeUi x0) {
      return x0.myNotForSmartExpand;
   }

   // $FF: synthetic method
   static TreePath access$6902(AbstractTreeUi x0, TreePath x1) {
      return x0.myRequestedExpand = x1;
   }

   // $FF: synthetic method
   static void access$7000(AbstractTreeUi x0, DefaultMutableTreeNode x1, boolean x2, boolean x3) {
      x0.processSmartExpand(x1, x2, x3);
   }

   // $FF: synthetic method
   static void access$7100(AbstractTreeUi x0) {
      x0.assertNotDispatchThread();
   }

   // $FF: synthetic method
   static void access$7200(AbstractTreeUi x0, Runnable x1, Runnable x2) {
      x0.unregisterWorkerTask(x1, x2);
   }

   // $FF: synthetic method
   static ProgressIndicator access$7300(AbstractTreeUi x0) {
      return x0.myProgress;
   }

   // $FF: synthetic method
   static void access$7400(AbstractTreeUi x0, DefaultMutableTreeNode x1) {
      x0.nodeStructureChanged(x1);
   }

   // $FF: synthetic method
   static void access$7500(AbstractTreeUi x0, TreePath x1) {
      x0.expandSilently(x1);
   }

   // $FF: synthetic method
   static void access$7600(AbstractTreeUi x0, TreePath x1) {
      x0.addSelectionSilently(x1);
   }

   // $FF: synthetic method
   static boolean access$7702(AbstractTreeUi x0, boolean x1) {
      return x0.myCanProcessDeferredSelections = x1;
   }

   // $FF: synthetic method
   static boolean access$7800(AbstractTreeUi x0, boolean x1, Runnable x2) {
      return x0.checkDeferred(x1, x2);
   }

   // $FF: synthetic method
   static void access$7900(AbstractTreeUi x0, Object x1, Runnable x2, boolean x3, boolean x4, boolean x5) {
      x0.selectVisible(x1, x2, x3, x4, x5);
   }

   // $FF: synthetic method
   static void access$8000(AbstractTreeUi x0) {
      x0.clearSelection();
   }

   // $FF: synthetic method
   static void access$8100(AbstractTreeUi x0, Set x1) {
      x0.restoreSelection(x1);
   }

   // $FF: synthetic method
   static void access$8200(AbstractTreeUi x0, Runnable x1) {
      x0.processInnerChange(x1);
   }

   // $FF: synthetic method
   static void access$8300(AbstractTreeUi x0, Object[] x1, int x2, Runnable x3, int[] x4, boolean x5, boolean x6, boolean x7) {
      x0.addNext(x1, x2, x3, x4, x5, x6, x7);
   }

   // $FF: synthetic method
   static void access$8400(AbstractTreeUi x0, Object[] x1, Runnable x2, boolean x3) {
      x0.addToDeferred(x1, x2, x3);
   }

   // $FF: synthetic method
   static void access$8500(AbstractTreeUi x0, Object x1, Runnable x2, boolean x3, boolean x4) {
      x0.checkPathAndMaybeRevalidate(x1, x2, x3, x4);
   }

   // $FF: synthetic method
   static int access$8600(AbstractTreeUi x0, Object x1) {
      return x0.getRowIfUnderSelection(x1);
   }

   // $FF: synthetic method
   static Runnable access$8700(AbstractTreeUi x0, Runnable x1, String x2) {
      return x0.wrapDone(x1, x2);
   }

   // $FF: synthetic method
   static void access$8800(AbstractTreeUi x0, Object[] x1, int x2, boolean x3, boolean x4, boolean x5, ActionCallback x6, int x7) {
      x0.expandNext(x1, x2, x3, x4, x5, x6, x7);
   }

   // $FF: synthetic method
   static void access$8900(AbstractTreeUi x0, Object x1, Runnable x2, boolean x3, boolean x4, boolean x5) {
      x0._expand(x1, x2, x3, x4, x5);
   }

   // $FF: synthetic method
   static TreePath access$9000(AbstractTreeUi x0) {
      return x0.mySilentSelect;
   }

   // $FF: synthetic method
   static void access$9100(AbstractTreeUi x0) {
      x0.dropUpdaterStateIfExternalChange();
   }

   // $FF: synthetic method
   static TreePath access$9200(AbstractTreeUi x0) {
      return x0.mySilentExpand;
   }

   // $FF: synthetic method
   static TreePath access$6900(AbstractTreeUi x0) {
      return x0.myRequestedExpand;
   }

   // $FF: synthetic method
   static void access$9300(AbstractTreeUi x0, DefaultMutableTreeNode x1) {
      x0.makeLoadingOrLeafIfNoChildren(x1);
   }

   // $FF: synthetic method
   static void access$9400(AbstractTreeUi x0, DefaultMutableTreeNode x1) {
      x0.maybeUpdateSubtreeToUpdate(x1);
   }

   // $FF: synthetic method
   static boolean access$9500(AbstractTreeUi x0, DefaultMutableTreeNode x1, boolean x2) {
      return x0.canSmartExpand(x1, x2);
   }

   // $FF: synthetic method
   static boolean access$9600(AbstractTreeUi x0, DefaultMutableTreeNode x1) {
      return x0.isSelectionInside(x1);
   }

   // $FF: synthetic method
   static void access$9700(AbstractTreeUi x0, DefaultMutableTreeNode x1) {
      x0.removeChildren(x1);
   }

   // $FF: synthetic method
   static void access$9800(AbstractTreeUi x0, TreePath x1, boolean x2, Condition x3, Object x4) {
      x0.addSelectionPath(x1, x2, x3, x4);
   }

   // $FF: synthetic method
   static boolean access$9900() {
      return isUnitTestingMode();
   }

   // $FF: synthetic method
   static void access$10000(AbstractTreeUi x0, DefaultMutableTreeNode x1, List x2, int x3, Runnable x4, boolean x5) {
      x0.processExpand(x1, x2, x3, x4, x5);
   }

   // $FF: synthetic method
   static void access$10100(AbstractTreeUi x0, Object x1, DefaultMutableTreeNode x2, Object x3) {
      x0.removeMapping(x1, x2, x3);
   }

   // $FF: synthetic method
   static void access$10200(AbstractTreeUi x0, DefaultMutableTreeNode x1, int x2, Object x3) {
      x0.adjustSelectionOnChildRemove(x1, x2, x3);
   }

   // $FF: synthetic method
   static void access$10300(AbstractTreeUi x0, DefaultMutableTreeNode x1) {
      x0.updateNodeImageAndPosition(x1);
   }

   // $FF: synthetic method
   private static void $$$reportNull$$$0(int var0) {
      String var10000;
      switch(var0) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 26:
      case 27:
      case 32:
      case 33:
      case 34:
      case 35:
      case 36:
      case 40:
      case 41:
      case 42:
      case 44:
      case 45:
      case 46:
      case 47:
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
      case 58:
      case 60:
      case 61:
      case 62:
      case 63:
      case 64:
      case 65:
      case 66:
      case 70:
      case 72:
      case 75:
      case 76:
      case 77:
      case 78:
      case 79:
      case 80:
      case 81:
      case 83:
      case 84:
      case 85:
      case 88:
      case 89:
      case 92:
      case 93:
      case 94:
      case 95:
      case 97:
      case 104:
      case 110:
      case 111:
      case 112:
      case 113:
      case 114:
      case 115:
      case 116:
      case 117:
      case 118:
      case 119:
      case 120:
      case 121:
      case 122:
      case 123:
      case 124:
      case 125:
      case 130:
      case 131:
      case 133:
      case 134:
      case 135:
      case 136:
      case 137:
      case 138:
      case 141:
      case 142:
      case 143:
      case 144:
      case 145:
      case 146:
      case 147:
      case 148:
      case 149:
      case 150:
      case 151:
      case 152:
      case 153:
      case 154:
      case 155:
      case 156:
      case 157:
      case 158:
      case 159:
      case 160:
      case 161:
      case 162:
      case 164:
      case 165:
      case 166:
      case 167:
      case 168:
      case 169:
      case 170:
      case 171:
      case 172:
      case 173:
      case 174:
      case 175:
      case 176:
      case 177:
      case 178:
      case 179:
      case 180:
      case 181:
      case 182:
      case 183:
      case 184:
      case 185:
      case 186:
      case 187:
      case 188:
      case 189:
      case 190:
      case 191:
      case 192:
      case 193:
      case 194:
      case 195:
      case 196:
      case 197:
      case 198:
      case 199:
      default:
         var10000 = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
         break;
      case 16:
      case 25:
      case 28:
      case 29:
      case 30:
      case 31:
      case 37:
      case 38:
      case 39:
      case 43:
      case 59:
      case 67:
      case 68:
      case 69:
      case 71:
      case 73:
      case 74:
      case 82:
      case 86:
      case 87:
      case 90:
      case 91:
      case 96:
      case 98:
      case 99:
      case 100:
      case 101:
      case 102:
      case 103:
      case 105:
      case 106:
      case 107:
      case 108:
      case 109:
      case 126:
      case 127:
      case 128:
      case 129:
      case 132:
      case 139:
      case 140:
      case 163:
      case 200:
         var10000 = "@NotNull method %s.%s must not return null";
      }

      byte var10001;
      switch(var0) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 26:
      case 27:
      case 32:
      case 33:
      case 34:
      case 35:
      case 36:
      case 40:
      case 41:
      case 42:
      case 44:
      case 45:
      case 46:
      case 47:
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
      case 58:
      case 60:
      case 61:
      case 62:
      case 63:
      case 64:
      case 65:
      case 66:
      case 70:
      case 72:
      case 75:
      case 76:
      case 77:
      case 78:
      case 79:
      case 80:
      case 81:
      case 83:
      case 84:
      case 85:
      case 88:
      case 89:
      case 92:
      case 93:
      case 94:
      case 95:
      case 97:
      case 104:
      case 110:
      case 111:
      case 112:
      case 113:
      case 114:
      case 115:
      case 116:
      case 117:
      case 118:
      case 119:
      case 120:
      case 121:
      case 122:
      case 123:
      case 124:
      case 125:
      case 130:
      case 131:
      case 133:
      case 134:
      case 135:
      case 136:
      case 137:
      case 138:
      case 141:
      case 142:
      case 143:
      case 144:
      case 145:
      case 146:
      case 147:
      case 148:
      case 149:
      case 150:
      case 151:
      case 152:
      case 153:
      case 154:
      case 155:
      case 156:
      case 157:
      case 158:
      case 159:
      case 160:
      case 161:
      case 162:
      case 164:
      case 165:
      case 166:
      case 167:
      case 168:
      case 169:
      case 170:
      case 171:
      case 172:
      case 173:
      case 174:
      case 175:
      case 176:
      case 177:
      case 178:
      case 179:
      case 180:
      case 181:
      case 182:
      case 183:
      case 184:
      case 185:
      case 186:
      case 187:
      case 188:
      case 189:
      case 190:
      case 191:
      case 192:
      case 193:
      case 194:
      case 195:
      case 196:
      case 197:
      case 198:
      case 199:
      default:
         var10001 = 3;
         break;
      case 16:
      case 25:
      case 28:
      case 29:
      case 30:
      case 31:
      case 37:
      case 38:
      case 39:
      case 43:
      case 59:
      case 67:
      case 68:
      case 69:
      case 71:
      case 73:
      case 74:
      case 82:
      case 86:
      case 87:
      case 90:
      case 91:
      case 96:
      case 98:
      case 99:
      case 100:
      case 101:
      case 102:
      case 103:
      case 105:
      case 106:
      case 107:
      case 108:
      case 109:
      case 126:
      case 127:
      case 128:
      case 129:
      case 132:
      case 139:
      case 140:
      case 163:
      case 200:
         var10001 = 2;
      }

      Object[] var2 = new Object[var10001];
      switch(var0) {
      case 0:
      default:
         var2[0] = "builder";
         break;
      case 1:
         var2[0] = "tree";
         break;
      case 2:
         var2[0] = "treeModel";
         break;
      case 3:
      case 70:
      case 72:
      case 79:
      case 83:
      case 110:
      case 141:
      case 142:
         var2[0] = "runnable";
         break;
      case 4:
      case 6:
      case 8:
      case 10:
      case 12:
      case 23:
      case 32:
      case 40:
      case 41:
      case 44:
      case 46:
      case 47:
      case 48:
      case 50:
      case 51:
      case 53:
      case 55:
      case 56:
      case 60:
      case 75:
      case 76:
      case 77:
      case 78:
      case 93:
      case 94:
      case 95:
      case 112:
      case 113:
      case 115:
      case 116:
      case 118:
      case 119:
      case 131:
      case 134:
      case 135:
      case 137:
      case 143:
      case 146:
      case 148:
      case 171:
      case 185:
      case 186:
      case 197:
         var2[0] = "node";
         break;
      case 5:
      case 7:
      case 9:
      case 11:
      case 14:
      case 20:
      case 22:
      case 97:
      case 165:
      case 166:
      case 168:
      case 170:
      case 172:
      case 173:
      case 174:
      case 179:
      case 189:
      case 190:
      case 192:
      case 193:
         var2[0] = "element";
         break;
      case 13:
      case 15:
      case 52:
      case 133:
      case 136:
      case 184:
         var2[0] = "path";
         break;
      case 16:
      case 25:
      case 28:
      case 29:
      case 30:
      case 31:
      case 37:
      case 38:
      case 39:
      case 43:
      case 59:
      case 67:
      case 68:
      case 69:
      case 71:
      case 73:
      case 74:
      case 82:
      case 86:
      case 87:
      case 90:
      case 91:
      case 96:
      case 98:
      case 99:
      case 100:
      case 101:
      case 102:
      case 103:
      case 105:
      case 106:
      case 107:
      case 108:
      case 109:
      case 126:
      case 127:
      case 128:
      case 129:
      case 132:
      case 139:
      case 140:
      case 163:
      case 200:
         var2[0] = "com/intellij/ide/util/treeView/AbstractTreeUi";
         break;
      case 17:
      case 33:
      case 34:
      case 35:
      case 42:
      case 45:
      case 49:
      case 54:
      case 58:
      case 62:
      case 63:
      case 66:
      case 80:
      case 84:
      case 125:
         var2[0] = "pass";
         break;
      case 18:
      case 19:
         var2[0] = "descriptor";
         break;
      case 21:
         var2[0] = "child";
         break;
      case 24:
      case 26:
         var2[0] = "nodeDescriptor";
         break;
      case 27:
         var2[0] = "actions";
         break;
      case 36:
         var2[0] = "state";
         break;
      case 57:
         var2[0] = "nodesToInsert";
         break;
      case 61:
      case 88:
      case 124:
         var2[0] = "elementToIndexMap";
         break;
      case 64:
         var2[0] = "producer";
         break;
      case 65:
         var2[0] = "processRunnable";
         break;
      case 81:
         var2[0] = "computable";
         break;
      case 85:
      case 158:
      case 167:
      case 176:
      case 180:
      case 181:
      case 183:
         var2[0] = "onDone";
         break;
      case 89:
         var2[0] = "loadedChildren";
         break;
      case 92:
         var2[0] = "requestor";
         break;
      case 104:
         var2[0] = "progressive";
         break;
      case 111:
         var2[0] = "updateInfo";
         break;
      case 114:
      case 199:
         var2[0] = "parent";
         break;
      case 117:
      case 191:
         var2[0] = "nodeActions";
         break;
      case 120:
      case 121:
         var2[0] = "nodeObject";
         break;
      case 122:
         var2[0] = "childNode";
         break;
      case 123:
      case 130:
      case 145:
      case 194:
         var2[0] = "parentNode";
         break;
      case 138:
         var2[0] = "bgBuildAction";
         break;
      case 144:
         var2[0] = "toInsert";
         break;
      case 147:
         var2[0] = "children";
         break;
      case 149:
      case 150:
      case 151:
      case 152:
         var2[0] = "root";
         break;
      case 153:
      case 154:
      case 155:
      case 156:
      case 157:
      case 159:
      case 160:
      case 164:
      case 175:
      case 177:
         var2[0] = "elements";
         break;
      case 161:
         var2[0] = "selection";
         break;
      case 162:
         var2[0] = "elementsToSelect";
         break;
      case 169:
         var2[0] = "name";
         break;
      case 178:
         var2[0] = "done";
         break;
      case 182:
         var2[0] = "kidsToExpand";
         break;
      case 187:
         var2[0] = "treeStructure";
         break;
      case 188:
         var2[0] = "rootNode";
         break;
      case 195:
         var2[0] = "action";
         break;
      case 196:
         var2[0] = "map";
         break;
      case 198:
         var2[0] = "subtreeRoot";
      }

      switch(var0) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 26:
      case 27:
      case 32:
      case 33:
      case 34:
      case 35:
      case 36:
      case 40:
      case 41:
      case 42:
      case 44:
      case 45:
      case 46:
      case 47:
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
      case 58:
      case 60:
      case 61:
      case 62:
      case 63:
      case 64:
      case 65:
      case 66:
      case 70:
      case 72:
      case 75:
      case 76:
      case 77:
      case 78:
      case 79:
      case 80:
      case 81:
      case 83:
      case 84:
      case 85:
      case 88:
      case 89:
      case 92:
      case 93:
      case 94:
      case 95:
      case 97:
      case 104:
      case 110:
      case 111:
      case 112:
      case 113:
      case 114:
      case 115:
      case 116:
      case 117:
      case 118:
      case 119:
      case 120:
      case 121:
      case 122:
      case 123:
      case 124:
      case 125:
      case 130:
      case 131:
      case 133:
      case 134:
      case 135:
      case 136:
      case 137:
      case 138:
      case 141:
      case 142:
      case 143:
      case 144:
      case 145:
      case 146:
      case 147:
      case 148:
      case 149:
      case 150:
      case 151:
      case 152:
      case 153:
      case 154:
      case 155:
      case 156:
      case 157:
      case 158:
      case 159:
      case 160:
      case 161:
      case 162:
      case 164:
      case 165:
      case 166:
      case 167:
      case 168:
      case 169:
      case 170:
      case 171:
      case 172:
      case 173:
      case 174:
      case 175:
      case 176:
      case 177:
      case 178:
      case 179:
      case 180:
      case 181:
      case 182:
      case 183:
      case 184:
      case 185:
      case 186:
      case 187:
      case 188:
      case 189:
      case 190:
      case 191:
      case 192:
      case 193:
      case 194:
      case 195:
      case 196:
      case 197:
      case 198:
      case 199:
      default:
         var2[1] = "com/intellij/ide/util/treeView/AbstractTreeUi";
         break;
      case 16:
         var2[1] = "getBuilder";
         break;
      case 25:
         var2[1] = "update";
         break;
      case 28:
      case 29:
      case 30:
      case 31:
         var2[1] = "queueUpdate";
         break;
      case 37:
      case 38:
      case 39:
         var2[1] = "setUpdaterState";
         break;
      case 43:
         var2[1] = "updateNodeChildren";
         break;
      case 59:
         var2[1] = "updateNodesToInsert";
         break;
      case 67:
      case 68:
      case 69:
         var2[1] = "maybeYield";
         break;
      case 71:
         var2[1] = "execute";
         break;
      case 73:
      case 74:
         var2[1] = "resetToReadyNow";
         break;
      case 82:
         var2[1] = "getStatus";
         break;
      case 86:
      case 87:
         var2[1] = "loadElementsFromStructure";
         break;
      case 90:
         var2[1] = "collectNodesToInsert";
         break;
      case 91:
         var2[1] = "getInitialized";
         break;
      case 96:
         var2[1] = "getNodeActions";
         break;
      case 98:
         var2[1] = "getLoadedChildrenFor";
         break;
      case 99:
      case 100:
         var2[1] = "getExpandedElements";
         break;
      case 101:
      case 102:
         var2[1] = "cancelUpdate";
         break;
      case 103:
         var2[1] = "acquireLock";
         break;
      case 105:
      case 106:
      case 107:
      case 108:
      case 109:
         var2[1] = "batch";
         break;
      case 126:
      case 127:
      case 128:
      case 129:
         var2[1] = "processExistingNode";
         break;
      case 132:
         var2[1] = "getExpiredElementCondition";
         break;
      case 139:
      case 140:
         var2[1] = "queueToBackground";
         break;
      case 163:
         var2[1] = "getSelectedElements";
         break;
      case 200:
         var2[1] = "getYeildingPasses";
      }

      switch(var0) {
      case 0:
      case 1:
      case 2:
      default:
         var2[2] = "init";
         break;
      case 3:
         var2[2] = "invokeLaterIfNeeded";
         break;
      case 4:
         var2[2] = "doExpandNodeChildren";
         break;
      case 5:
         var2[2] = "getNodeForElement";
         break;
      case 6:
         var2[2] = "isNodeInStructure";
         break;
      case 7:
      case 8:
         var2[2] = "isNodeValidForElement";
         break;
      case 9:
      case 10:
         var2[2] = "isValidChildOfParent";
         break;
      case 11:
      case 12:
         var2[2] = "isSameHierarchy";
         break;
      case 13:
         var2[2] = "getNodeForPath";
         break;
      case 14:
         var2[2] = "buildNodeForElement";
         break;
      case 15:
         var2[2] = "buildNodeForPath";
      case 16:
      case 25:
      case 28:
      case 29:
      case 30:
      case 31:
      case 37:
      case 38:
      case 39:
      case 43:
      case 59:
      case 67:
      case 68:
      case 69:
      case 71:
      case 73:
      case 74:
      case 82:
      case 86:
      case 87:
      case 90:
      case 91:
      case 96:
      case 98:
      case 99:
      case 100:
      case 101:
      case 102:
      case 103:
      case 105:
      case 106:
      case 107:
      case 108:
      case 109:
      case 126:
      case 127:
      case 128:
      case 129:
      case 132:
      case 139:
      case 140:
      case 163:
      case 200:
         break;
      case 17:
         var2[2] = "initRootNodeNowIfNeeded";
         break;
      case 18:
      case 19:
      case 23:
         var2[2] = "isAutoExpand";
         break;
      case 20:
         var2[2] = "validateAutoExpand";
         break;
      case 21:
         var2[2] = "isInVisibleAutoExpandChain";
         break;
      case 22:
         var2[2] = "getDistanceToAutoExpandRoot";
         break;
      case 24:
      case 26:
         var2[2] = "update";
         break;
      case 27:
         var2[2] = "processDeferredActions";
         break;
      case 32:
      case 33:
         var2[2] = "updateSubtree";
         break;
      case 34:
         var2[2] = "updateSubtreeNow";
         break;
      case 35:
         var2[2] = "updateRow";
         break;
      case 36:
         var2[2] = "setUpdaterState";
         break;
      case 40:
         var2[2] = "doUpdateNode";
         break;
      case 41:
      case 42:
         var2[2] = "updateNodeChildren";
         break;
      case 44:
      case 45:
         var2[2] = "doUpdateChildren";
         break;
      case 46:
         var2[2] = "processAlwaysLeaf";
         break;
      case 47:
         var2[2] = "isChildNodeForceUpdate";
         break;
      case 48:
      case 49:
         var2[2] = "updateNodeChildrenNow";
         break;
      case 50:
         var2[2] = "isDisposed";
         break;
      case 51:
      case 52:
      case 173:
      case 174:
         var2[2] = "expand";
         break;
      case 53:
      case 54:
         var2[2] = "processUnbuilt";
         break;
      case 55:
         var2[2] = "removeIfLoading";
         break;
      case 56:
         var2[2] = "moveSelectionToParentIfNeeded";
         break;
      case 57:
      case 58:
         var2[2] = "updateNodesToInsert";
         break;
      case 60:
      case 61:
      case 62:
         var2[2] = "processExistingNodes";
         break;
      case 63:
         var2[2] = "isRerunNeeded";
         break;
      case 64:
         var2[2] = "calculateYieldingToWriteAction";
         break;
      case 65:
      case 66:
         var2[2] = "maybeYield";
         break;
      case 70:
      case 72:
         var2[2] = "execute";
         break;
      case 75:
         var2[2] = "addToCancelled";
         break;
      case 76:
         var2[2] = "removeFromCancelled";
         break;
      case 77:
         var2[2] = "isCancelled";
         break;
      case 78:
         var2[2] = "resetIncompleteNode";
         break;
      case 79:
      case 80:
         var2[2] = "yieldAndRun";
         break;
      case 81:
         var2[2] = "checkValue";
         break;
      case 83:
      case 84:
         var2[2] = "executeYieldingRequest";
         break;
      case 85:
         var2[2] = "runOnYieldingDone";
         break;
      case 88:
      case 89:
         var2[2] = "collectNodesToInsert";
         break;
      case 92:
         var2[2] = "getReady";
         break;
      case 93:
         var2[2] = "addToUpdatingChildren";
         break;
      case 94:
         var2[2] = "removeFromUpdatingChildren";
         break;
      case 95:
         var2[2] = "isParentUpdatingChildrenNow";
         break;
      case 97:
         var2[2] = "getLoadedChildrenFor";
         break;
      case 104:
         var2[2] = "batch";
         break;
      case 110:
         var2[2] = "executeUserRunnable";
         break;
      case 111:
      case 112:
         var2[2] = "queueBackgroundUpdate";
         break;
      case 113:
         var2[2] = "isExpanded";
         break;
      case 114:
         var2[2] = "removeLoading";
         break;
      case 115:
         var2[2] = "processNodeActionsIfReady";
         break;
      case 116:
      case 117:
         var2[2] = "processActions";
         break;
      case 118:
         var2[2] = "processSmartExpand";
         break;
      case 119:
         var2[2] = "getChildForSmartExpand";
         break;
      case 120:
         var2[2] = "isParentLoadingInBackground";
         break;
      case 121:
         var2[2] = "getParentLoadingInBackground";
         break;
      case 122:
      case 123:
      case 124:
      case 125:
         var2[2] = "processExistingNode";
         break;
      case 130:
         var2[2] = "adjustSelectionOnChildRemove";
         break;
      case 131:
         var2[2] = "isValidForSelectionAdjusting";
         break;
      case 133:
         var2[2] = "addSelectionPath";
         break;
      case 134:
         var2[2] = "getPathFor";
         break;
      case 135:
         var2[2] = "removeNodeFromParent";
         break;
      case 136:
         var2[2] = "expandPath";
         break;
      case 137:
         var2[2] = "makeLoadingOrLeafIfNoChildren";
         break;
      case 138:
         var2[2] = "queueToBackground";
         break;
      case 141:
         var2[2] = "registerWorkerTask";
         break;
      case 142:
         var2[2] = "unregisterWorkerTask";
         break;
      case 143:
         var2[2] = "updateNodeImageAndPosition";
         break;
      case 144:
      case 145:
         var2[2] = "insertNodesInto";
         break;
      case 146:
      case 147:
         var2[2] = "sortChildren";
         break;
      case 148:
         var2[2] = "disposeNode";
         break;
      case 149:
      case 150:
      case 151:
      case 152:
         var2[2] = "addSubtreeToUpdate";
         break;
      case 153:
      case 154:
      case 155:
         var2[2] = "select";
         break;
      case 156:
      case 157:
      case 158:
      case 160:
         var2[2] = "_select";
         break;
      case 159:
         var2[2] = "userSelect";
         break;
      case 161:
         var2[2] = "restoreSelection";
         break;
      case 162:
         var2[2] = "addToDeferred";
         break;
      case 164:
         var2[2] = "addNext";
         break;
      case 165:
         var2[2] = "doSelect";
         break;
      case 166:
      case 167:
         var2[2] = "checkPathAndMaybeRevalidate";
         break;
      case 168:
         var2[2] = "selectVisible";
         break;
      case 169:
         var2[2] = "wrapDone";
         break;
      case 170:
      case 171:
         var2[2] = "wrapScrollTo";
         break;
      case 172:
         var2[2] = "getRowIfUnderSelection";
         break;
      case 175:
      case 176:
      case 180:
         var2[2] = "_expand";
         break;
      case 177:
      case 178:
         var2[2] = "expandNext";
         break;
      case 179:
         var2[2] = "collapseChildren";
         break;
      case 181:
         var2[2] = "deferExpansion";
         break;
      case 182:
      case 183:
         var2[2] = "processExpand";
         break;
      case 184:
      case 185:
         var2[2] = "isNodeBeingBuilt";
         break;
      case 186:
         var2[2] = "getParentBuiltNode";
         break;
      case 187:
         var2[2] = "setTreeStructure";
         break;
      case 188:
         var2[2] = "setRootNode";
         break;
      case 189:
         var2[2] = "createMapping";
         break;
      case 190:
         var2[2] = "removeMapping";
         break;
      case 191:
         var2[2] = "_remapNodeActions";
         break;
      case 192:
         var2[2] = "getFirstNode";
         break;
      case 193:
         var2[2] = "findNode";
         break;
      case 194:
         var2[2] = "findNodeForChildElement";
         break;
      case 195:
         var2[2] = "addNodeAction";
         break;
      case 196:
         var2[2] = "_addNodeAction";
         break;
      case 197:
         var2[2] = "removeChildren";
         break;
      case 198:
         var2[2] = "maybeUpdateSubtreeToUpdate";
         break;
      case 199:
         var2[2] = "isSelectionInside";
      }

      var10000 = String.format(var10000, var2);
      Object var1;
      String var4;
      switch(var0) {
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 26:
      case 27:
      case 32:
      case 33:
      case 34:
      case 35:
      case 36:
      case 40:
      case 41:
      case 42:
      case 44:
      case 45:
      case 46:
      case 47:
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
      case 58:
      case 60:
      case 61:
      case 62:
      case 63:
      case 64:
      case 65:
      case 66:
      case 70:
      case 72:
      case 75:
      case 76:
      case 77:
      case 78:
      case 79:
      case 80:
      case 81:
      case 83:
      case 84:
      case 85:
      case 88:
      case 89:
      case 92:
      case 93:
      case 94:
      case 95:
      case 97:
      case 104:
      case 110:
      case 111:
      case 112:
      case 113:
      case 114:
      case 115:
      case 116:
      case 117:
      case 118:
      case 119:
      case 120:
      case 121:
      case 122:
      case 123:
      case 124:
      case 125:
      case 130:
      case 131:
      case 133:
      case 134:
      case 135:
      case 136:
      case 137:
      case 138:
      case 141:
      case 142:
      case 143:
      case 144:
      case 145:
      case 146:
      case 147:
      case 148:
      case 149:
      case 150:
      case 151:
      case 152:
      case 153:
      case 154:
      case 155:
      case 156:
      case 157:
      case 158:
      case 159:
      case 160:
      case 161:
      case 162:
      case 164:
      case 165:
      case 166:
      case 167:
      case 168:
      case 169:
      case 170:
      case 171:
      case 172:
      case 173:
      case 174:
      case 175:
      case 176:
      case 177:
      case 178:
      case 179:
      case 180:
      case 181:
      case 182:
      case 183:
      case 184:
      case 185:
      case 186:
      case 187:
      case 188:
      case 189:
      case 190:
      case 191:
      case 192:
      case 193:
      case 194:
      case 195:
      case 196:
      case 197:
      case 198:
      case 199:
      default:
         IllegalArgumentException var3 = new IllegalArgumentException;
         var4 = var10000;
         var1 = var3;
         var3.<init>(var4);
         break;
      case 16:
      case 25:
      case 28:
      case 29:
      case 30:
      case 31:
      case 37:
      case 38:
      case 39:
      case 43:
      case 59:
      case 67:
      case 68:
      case 69:
      case 71:
      case 73:
      case 74:
      case 82:
      case 86:
      case 87:
      case 90:
      case 91:
      case 96:
      case 98:
      case 99:
      case 100:
      case 101:
      case 102:
      case 103:
      case 105:
      case 106:
      case 107:
      case 108:
      case 109:
      case 126:
      case 127:
      case 128:
      case 129:
      case 132:
      case 139:
      case 140:
      case 163:
      case 200:
         IllegalStateException var10002 = new IllegalStateException;
         var4 = var10000;
         var1 = var10002;
         var10002.<init>(var4);
      }

      throw var1;
   }
}
